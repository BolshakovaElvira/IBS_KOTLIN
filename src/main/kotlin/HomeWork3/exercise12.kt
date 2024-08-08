fun main(args: Array<String>) {
    // ЗАДАНИЕ 12
    fun isLeapYear(year: Int): Boolean {
        return if (year % 400 == 0) {
            true
        } else if (year % 100 == 0) {
            false
        } else {
            year % 4 == 0
        }
    }
}