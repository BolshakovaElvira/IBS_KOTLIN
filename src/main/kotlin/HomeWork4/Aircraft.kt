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
        println("Номер воздушного судна: $aircraftNumber")
        println("Максимальная дальность полета: $maxFlightRange км")
        println("Запас топлива: $fuelCapacity литров(а)")
        println("Расход топлива: $fuelConsumption литров(а) на 100 км")
        println("Вместимость пассажиров: $passengerCapacity")
    }
}





