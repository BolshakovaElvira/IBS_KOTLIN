package HomeWork4

open class Aircraft(
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

class Boeing747(
    aircraftNumber: String,
    maxFlightRange: Double,
    fuelCapacity: Double,
    val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity) {

}





