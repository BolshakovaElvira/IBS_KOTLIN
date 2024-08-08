package HomeWork4

abstract class Aircraft(
    protected val aircraftNumber: String,
    protected val maxFlightRange: Double,
    protected val fuelCapacity: Double
) {
    val fuelConsumption: Double
        get() {
            return if (maxFlightRange > 0) {
                (fuelCapacity / maxFlightRange) * 100
            } else {
                0.0
            }
        }
    abstract fun displayInfo()
}

interface Passenger {
    val passengerCapacity: Int
}

class Boeing747(
    aircraftNumber: String,
    maxFlightRange: Double,
    fuelCapacity: Double,
    override val passengerCapacity: Int
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Passenger {
    override fun displayInfo() {
        println("Aircraft Number: $aircraftNumber")
        println("Max Flight Range: $maxFlightRange km")
        println("Fuel Capacity: $fuelCapacity liters")
        println("Fuel Consumption: $fuelConsumption liters/100 km")
        println("Passenger Capacity: $passengerCapacity passengers")
    }
}





