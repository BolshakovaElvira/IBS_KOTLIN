fun main(args: Array<String>){
    // ЗАДАНИЕ 8
    println("Введите сумму вклада:")
    val deposit = readLine()?.toDouble() ?: 0.0

    println("Введите длительность вклада (месяцы):")
    val duration = readLine()?.toInt() ?: 0

    println("Введите ежемесячный процент:")
    val rate = readLine()?.toDouble() ?: 0.0

    var total = deposit
    for (month in 1..duration) {
        val interest = total * (rate / 100)
        total += interest
        println("Месяц $month: +$interest, Итого: $total")
    }
}