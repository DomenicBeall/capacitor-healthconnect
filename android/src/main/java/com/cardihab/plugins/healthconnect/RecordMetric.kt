package com.cardihab.plugins.healthconnect

import android.app.Activity
import androidx.health.connect.client.aggregate.AggregateMetric
import androidx.health.connect.client.records.*

class RecordMetric {

    companion object {
        fun getAggregateMetricsByRecordName(recordName: String): Set<AggregateMetric<*>>? {
            return when (recordName) {
                "activeCaloriesBurned" -> setOf(ActiveCaloriesBurnedRecord.ACTIVE_CALORIES_TOTAL)
                "basalMetabolicRate" -> setOf(BasalMetabolicRateRecord.BASAL_CALORIES_TOTAL)
                "bloodPressure" -> setOf(
                        BloodPressureRecord.DIASTOLIC_AVG,
                        BloodPressureRecord.DIASTOLIC_MAX,
                        BloodPressureRecord.DIASTOLIC_MIN,
                        BloodPressureRecord.SYSTOLIC_AVG,
                        BloodPressureRecord.SYSTOLIC_MAX,
                        BloodPressureRecord.SYSTOLIC_MIN
                )
                "cyclingPedalingCadence" -> setOf(
                        CyclingPedalingCadenceRecord.RPM_AVG,
                        CyclingPedalingCadenceRecord.RPM_MAX,
                        CyclingPedalingCadenceRecord.RPM_MIN
                )
                "distance" -> setOf(DistanceRecord.DISTANCE_TOTAL)
                "elevationGained" -> setOf(ElevationGainedRecord.ELEVATION_GAINED_TOTAL)
                "exerciseSession" -> setOf(ExerciseSessionRecord.ACTIVE_TIME_TOTAL)
                "floorsClimbed" -> setOf(FloorsClimbedRecord.FLOORS_CLIMBED_TOTAL)
                "heartRate" -> setOf(
                    HeartRateRecord.BPM_AVG,
                    HeartRateRecord.BPM_MAX,
                    HeartRateRecord.BPM_MIN,
                    HeartRateRecord.MEASUREMENTS_COUNT
                )
                "height" -> setOf(
                    HeightRecord.HEIGHT_AVG,
                    HeightRecord.HEIGHT_MAX,
                    HeightRecord.HEIGHT_MIN
                )
                "hydration" -> setOf(HydrationRecord.VOLUME_TOTAL)
                "nutrition" -> setOf(
                    NutritionRecord.BIOTIN_TOTAL,
                    NutritionRecord.CAFFEINE_TOTAL,
                    NutritionRecord.CALCIUM_TOTAL,
                    NutritionRecord.CHLORIDE_TOTAL,
                    NutritionRecord.CHROMIUM_TOTAL,
                    NutritionRecord.CHOLESTEROL_TOTAL,
                    NutritionRecord.COPPER_TOTAL,
                    NutritionRecord.DIETARY_FIBER_TOTAL,
                    NutritionRecord.FOLATE_TOTAL,
                    NutritionRecord.FOLIC_ACID_TOTAL,
                    NutritionRecord.IODINE_TOTAL,
                    NutritionRecord.IRON_TOTAL,
                    NutritionRecord.MAGNESIUM_TOTAL,
                    NutritionRecord.MANGANESE_TOTAL,
                    NutritionRecord.MOLYBDENUM_TOTAL,
                    NutritionRecord.MONOUNSATURATED_FAT_TOTAL,
                    NutritionRecord.NIACIN_TOTAL,
                    NutritionRecord.PHOSPHORUS_TOTAL,
                    NutritionRecord.PANTOTHENIC_ACID_TOTAL,
                    NutritionRecord.POTASSIUM_TOTAL,
                    NutritionRecord.PROTEIN_TOTAL,
                    NutritionRecord.POLYUNSATURATED_FAT_TOTAL,
                    NutritionRecord.RIBOFLAVIN_TOTAL,
                    NutritionRecord.SELENIUM_TOTAL,
                    NutritionRecord.SODIUM_TOTAL,
                    NutritionRecord.SUGAR_TOTAL,
                    NutritionRecord.SATURATED_FAT_TOTAL,
                    NutritionRecord.TOTAL_CARBOHYDRATE_TOTAL,
                    NutritionRecord.THIAMIN_TOTAL,
                    NutritionRecord.TOTAL_FAT_TOTAL,
                    NutritionRecord.TRANS_FAT_TOTAL,
                    NutritionRecord.UNSATURATED_FAT_TOTAL,
                    NutritionRecord.VITAMIN_A_TOTAL,
                    NutritionRecord.VITAMIN_B12_TOTAL,
                    NutritionRecord.VITAMIN_B6_TOTAL,
                    NutritionRecord.VITAMIN_C_TOTAL,
                    NutritionRecord.VITAMIN_D_TOTAL,
                    NutritionRecord.VITAMIN_E_TOTAL,
                    NutritionRecord.VITAMIN_K_TOTAL,
                    NutritionRecord.ZINC_TOTAL
                )
                "power" -> setOf(
                    PowerRecord.POWER_AVG,
                    PowerRecord.POWER_MAX,
                    PowerRecord.POWER_MIN
                )
                "restingHeartRate" -> setOf(
                    RestingHeartRateRecord.BPM_AVG,
                    RestingHeartRateRecord.BPM_MAX,
                    RestingHeartRateRecord.BPM_MIN
                )
                "sleepSession" -> setOf(SleepSessionRecord.SLEEP_DURATION_TOTAL)
                "speed" -> setOf(
                    SpeedRecord.SPEED_AVG,
                    SpeedRecord.SPEED_MAX,
                    SpeedRecord.SPEED_MIN
                )
                else -> null
            }
        }
    }

}