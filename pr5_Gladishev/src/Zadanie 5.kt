fun main() {
    try {
        var num: Int
        print("Введите число: ")
        num = readln()!!.toInt()
        when {
            num/100 == num%10 -> println("первая и третья цифры числа равны")
            num/100 != num%10 -> println("первая и третья цифры числа не равны")
            else -> println("Некорректный ввод")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}