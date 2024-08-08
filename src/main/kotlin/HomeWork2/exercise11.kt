fun main(args: Array<String>) {
    // ЗАДАНИЕ 11
    val workplaces = mapOf(
        1 to "Иванов И.И.",
        2 to "Петров П.П.",
        3 to "Сидоров С.С.",
        4 to "Иванова И.И."
    )

    println("Введите номер рабочего места:")
    val workplaceNumber = readLine()?.toIntOrNull() ?: 0

    println(workplaces[workplaceNumber] ?: "Рабочее место не найдено")
}