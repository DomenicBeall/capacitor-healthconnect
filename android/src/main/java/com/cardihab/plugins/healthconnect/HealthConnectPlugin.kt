package com.cardihab.plugins.healthconnect

import android.os.Build
import com.getcapacitor.annotation.CapacitorPlugin
import androidx.health.connect.client.HealthConnectClient
import com.getcapacitor.PluginMethod
import androidx.health.connect.client.records.StepsRecord
import androidx.annotation.RequiresApi
import androidx.collection.ArraySet
import androidx.health.connect.client.aggregate.AggregateMetric
import androidx.health.connect.client.request.AggregateRequest
import com.getcapacitor.PluginCall
import androidx.health.connect.client.time.TimeRangeFilter
import com.getcapacitor.JSObject
import com.getcapacitor.Plugin
import java.util.*

@CapacitorPlugin(name = "HealthConnect")
class HealthConnectPlugin : Plugin() {

    private var healthConnectClient: HealthConnectClient? = null

    @PluginMethod
    override fun load() {
        if (HealthConnectClient.isAvailable(context)) {
            healthConnectClient = HealthConnectClient.getOrCreate(context)
        }
    }

    @PluginMethod
    fun isAvailable(call: PluginCall) {
        if (HealthConnectClient.isAvailable(context)) {
            return call.resolve();
        } else {
            return call.reject("HealthConnect is not available")
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @PluginMethod
    suspend fun queryAggregatedDailySampleType(call: PluginCall) {
        if (call.hasOption("recordName")
                && call.hasOption("startDate")
                && call.hasOption("endDate")
                && call.hasOption("limit")) {
            return call.reject("queryAggregatedDailySampleType is missing parameters.")
        }

        val recordName = call.getString("recordName")
        val startDate = call.getString("startDate")
        val endDate = call.getString("endDate")
        val limit = call.getString("limit")

        val startInstant = Date(startDate).toInstant()
        val endInstant = Date(endDate).toInstant()

        val aggregateMetric = getAggregateMetricByRecordName(recordName!!);

        val response = healthConnectClient!!.aggregate(
            AggregateRequest(
                    metrics = setOf(aggregateMetric!!),
                    timeRangeFilter = TimeRangeFilter.between(startInstant, endInstant)
            )
        )

        var jsResponse: JSObject = JSObject()
        jsResponse.put(recordName, response[aggregateMetric])
        call.resolve(jsResponse)
    }

    private fun getAggregateMetricByRecordName(recordName: String): AggregateMetric<*>? {
        return when (recordName) {
            "steps" -> StepsRecord.COUNT_TOTAL
            else -> null
        }
    }

}