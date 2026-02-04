fun main() {
    try {
        var age: Int
        print("Введите возраст: ")
        age = readln()!!.toInt()
        print("Стадия жизни: ")
        when (age) {
            in 0..2 -> println("Младенец")
            in 3..6 -> println("Дошкольный возраст")
            in 7..11 -> println("Младшый школьный возраст")
            in 12..17 -> println("Подросток")
            in 18..25 -> println("Юность")
            in 26..60 -> println("Зреслость")
            in 61..150 -> println("Пожилой возраст")
            else -> println("Некорректный возраст")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}   