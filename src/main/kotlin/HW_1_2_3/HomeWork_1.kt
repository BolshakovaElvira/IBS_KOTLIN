fun main(args: Array<String>){
    // ЗАДАНИЕ 1
    var firstVariable: Any? = null
    firstVariable = 10

    val secondVariable = firstVariable!! / 2.5
    // second имеет тип Double

    // ЗАДАНИЕ 2
    val hello = "hello"
    val aplana = "aplana"
    println("$hello $aplana")

    // ЗАДАНИЕ 3
    val five: Char = '5'

    val fiveString: String = five.toString()
    val fiveByte: Byte = five.code.toByte()
    val fiveShort: Short = five.code.toShort()
    val fiveInt: Int = five.code
    val fiveDouble: Double = five.code.toDouble()
    val fiveFloat: Float = five.code.toFloat()
    val fiveLong: Long = five.code.toLong()

    // ЗАДАНИЕ 4
    println("Введите ваше имя:")
    val name = readLine()
    println("Привет, $name!")

    // ЗАДАНИЕ 5
    val range = 'z' downTo 'a'

    // ЗАДАНИЕ 6
    println("Введите первое число:")
    val a = readLine()?.toInt() ?: 0
    println("Введите второе число:")
    val b = readLine()?.toInt() ?: 0

    val isAGreaterThanB = a > b
    println("Результат сравнения: $isAGreaterThanB")
}