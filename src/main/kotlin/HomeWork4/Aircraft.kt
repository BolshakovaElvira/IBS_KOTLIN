package HomeWork4

class Aircraft(
    val aircraftNumber: String,
    val maxFlightRange: Double,
    val fuelCapacity: Double
) {
    val fuelConsumption: Double
        get() {
            return if (maxFlightRange > 0) {
                (fuelCapacity / maxFlightRange) * 100
            } else {
                0.0
            }
        }
}





