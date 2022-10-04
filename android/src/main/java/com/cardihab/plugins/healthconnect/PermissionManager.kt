package com.cardihab.plugins.healthconnect

import android.app.Activity
import androidx.activity.result.ActivityResultCaller
import androidx.health.connect.client.HealthConnectClient
import androidx.health.connect.client.PermissionController
import androidx.health.connect.client.permission.HealthPermission
import androidx.health.connect.client.records.*

class PermissionManager: Activity() {

    companion object {

        private fun getPermissionSet(): Set<HealthPermission> {
            return setOf(
                HealthPermission.createReadPermission(ActiveCaloriesBurnedRecord::class),
                HealthPermission.createReadPermission(BasalBodyTemperatureRecord::class),
                HealthPermission.createReadPermission(BasalMetabolicRateRecord::class),
                HealthPermission.createReadPermission(BloodGlucoseRecord::class),
                HealthPermission.createReadPermission(BloodPressureRecord::class),
                HealthPermission.createReadPermission(BodyFatRecord::class),
                HealthPermission.createReadPermission(BodyTemperatureRecord::class),
                HealthPermission.createReadPermission(BoneMassRecord::class),
                HealthPermission.createReadPermission(CervicalMucusRecord::class),
                HealthPermission.createReadPermission(CyclingPedalingCadenceRecord::class),
                HealthPermission.createReadPermission(DistanceRecord::class),
                HealthPermission.createReadPermission(ElevationGainedRecord::class),
                HealthPermission.createReadPermission(ExerciseEventRecord::class),
                HealthPermission.createReadPermission(ExerciseLapRecord::class),
                HealthPermission.createReadPermission(ExerciseRepetitionsRecord::class),
                HealthPermission.createReadPermission(ExerciseSessionRecord::class),
                HealthPermission.createReadPermission(FloorsClimbedRecord::class),
                HealthPermission.createReadPermission(HeartRateRecord::class),
                HealthPermission.createReadPermission(HeightRecord::class),
                HealthPermission.createReadPermission(HipCircumferenceRecord::class),
                HealthPermission.createReadPermission(HydrationRecord::class),
                HealthPermission.createReadPermission(LeanBodyMassRecord::class),
                HealthPermission.createReadPermission(MenstruationFlowRecord::class),
                HealthPermission.createReadPermission(NutritionRecord::class),
                HealthPermission.createReadPermission(OvulationTestRecord::class),
                HealthPermission.createReadPermission(OxygenSaturationRecord::class),
                HealthPermission.createReadPermission(PowerRecord::class),
                HealthPermission.createReadPermission(RespiratoryRateRecord::class),
                HealthPermission.createReadPermission(RestingHeartRateRecord::class),
                HealthPermission.createReadPermission(SexualActivityRecord::class),
                HealthPermission.createReadPermission(SleepSessionRecord::class),
                HealthPermission.createReadPermission(SleepStageRecord::class),
                HealthPermission.createReadPermission(SpeedRecord::class),
                HealthPermission.createReadPermission(StepsCadenceRecord::class),
                HealthPermission.createReadPermission(StepsRecord::class),
                HealthPermission.createReadPermission(SwimmingStrokesRecord::class),
                HealthPermission.createReadPermission(TotalCaloriesBurnedRecord::class),
                HealthPermission.createReadPermission(Vo2MaxRecord::class),
                HealthPermission.createReadPermission(WaistCircumferenceRecord::class),
                HealthPermission.createReadPermission(WeightRecord::class),
                HealthPermission.createReadPermission(WheelchairPushesRecord::class)
            );
        }
    }

}