fun main(args: Array<String>) {
    // ЗАДАНИЕ 14
    fun printEmployeeInfo(name: String, position: String) {
        println("ФИО: $name, Должность: $position")
    }

    fun printEmployeeInfo(name: String, age: Int, position: String) {
        println("ФИО: $name, Возраст: $age, Должность: $position")
    }

    fun printEmployeeInfo(name: String, maritalStatus: String, position: String) {
        println("ФИО: $name, Семейное положение: $maritalStatus, Должность: $position")
    }

    fun printEmployeeInfo(name: String, age: Int, maritalStatus: String, position: String) {
        println("ФИО: $name, Возраст: $age, Семейное положение: $maritalStatus, Должность: $position")
    }
}