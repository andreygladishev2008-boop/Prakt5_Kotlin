fun main ()
{
    try {
        var num: Int
        print("Введите число от 1 до 9: ")
        num = readln()!!.toInt()
        print("Число: ")
        when (num) {
            0 -> println("Ноль")
            1 -> println("Один")
            2 -> println("Два")
            3 -> println("Три")
            4 -> println("Четыре")
            5 -> println("Пять")
            6 -> println("Шесть")
            7 -> println("Семь")
            8 -> println("Восемь")
            9 -> println("Девять")
            else -> println("Число вне диапозона")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}