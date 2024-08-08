package HomeWork4

class Aircraft(
    val aircraftNumber: String = "1234",
    val maxFlightRange: Double = 12000.0,
    val fuelCapacity: Double = 500.0
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





