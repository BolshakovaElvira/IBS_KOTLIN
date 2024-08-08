fun main(args: Array<String>){
    // ЗАДАНИЕ 9
    val countries = arrayOf("Россия", "США", "Германия")
    val capitals = arrayOf("Москва", "Вашингтон", "Берлин")
    val currencies = arrayOf("Рубль", "Доллар", "Евро")

    for (i in countries.indices) {
        println("${countries[i]} | ${capitals[i]} | ${currencies[i]}")
    }

}