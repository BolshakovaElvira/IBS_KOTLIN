fun main(args: Array<String>) {
    // ЗАДАНИЕ 15
    val printArray: (Array<String>) -> Unit = { array ->
        array.forEach { item ->
            println(item)
        }
    }
}