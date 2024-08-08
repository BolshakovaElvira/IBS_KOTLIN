data class Car(
    val brand: String,
    val color: String,
    val number: String
)

fun main() {
    val car1 = Car("Toyota", "Red", "ABC-123")
    val car2 = Car("Honda", "Blue", "XYZ-456")
    val car3 = Car("Ford", "Green", "DEF-789")

    println(car1)
    println(car2)
    println(car3)
}