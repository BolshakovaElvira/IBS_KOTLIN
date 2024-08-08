fun main(args: Array<String>) {
    // ЗАДАНИЕ 10
    val cities = mutableListOf<String>()

    while (true) {
        println("Выберите действие (1-4):")
        println("1. Добавить город\n2. Показать все города\n3. Показать уникальные города\n4. Выход")

        when (readLine()) {
            "1" -> {
                println("Введите название города:")
                cities.add(readLine() ?: "")
            }
            "2" -> println(cities)
            "3" -> println(cities.distinct())
            "4" -> break
            else -> println("Неверный выбор")
        }
    }
}