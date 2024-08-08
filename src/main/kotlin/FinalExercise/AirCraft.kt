package FinalExercise


interface Passenger {
    val passengerCapacity: Int
}

interface Cargo {
    val cargoCapacity: Double
}


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

class SuperJet100(
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

class AN225(
    aircraftNumber: String,
    maxFlightRange: Double,
    fuelCapacity: Double,
    override val cargoCapacity: Double
) : Aircraft(aircraftNumber, maxFlightRange, fuelCapacity), Cargo {

    override fun displayInfo() {
        println("Номер воздушного судна: $aircraftNumber")
        println("Максимальная дальность полета: $maxFlightRange км")
        println("Запас топлива: $fuelCapacity литров(а)")
        println("Расход топлива: $fuelConsumption литров(а) на 100 км")
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

fun main() {
    val aircrafts: MutableList<Aircraft> = mutableListOf()
    
    aircrafts.add(Boeing747("B747", 13000.0, 23800.0, 416))
    aircrafts.add(AN225("C123", 8000.0, 15000.0, 30.0))
    aircrafts.add(Boeing747("B777", 15000.0, 30000.0, 396))
    aircrafts.add(AN225("C456", 10000.0, 20000.0, 25.0))
    aircrafts.add(SuperJet100("S366", 12000.0, 25000.0, 300))

    while (true) {
        println("Выберите команду:")
        println("1. Показать информацию о всех самолетах")
        println("2. Показать информацию о конкретном самолете")
        println("3. Выход")

        when (readLine()) {
            "1" -> {
                println("Информация о всех самолетах:")
                for (aircraft in aircrafts) {
                    aircraft.displayInfo()
                    println()
                }
            }
            "2" -> {
                println("Введите номер самолета (0-${aircrafts.size - 1}):")
                val index = readLine()?.toIntOrNull()
                if (index != null && index in aircrafts.indices) {
                    aircrafts[index].displayInfo()
                } else {
                    println("Некорректный номер самолета.")
                }
            }
            "3" -> {
                println("Выход из программы.")
                return
            }
            else -> {
                println("Некорректный выбор. Пожалуйста, выберите команду снова.")
            }
        }
    }
}
