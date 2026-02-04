fun main() {
    try {
        var num: Double = 0.0
        var x: Double
        print("Введите число x (<=3 / >3.6): ")
        x = readln()!!.toDouble()
        print("F($x) = ")
        when {
            (x > 3.6) -> num = 45 * (x*x) + 5
            (x <= 3) -> num = (5*x)/(10*(x*x)+1)
            else -> println("Некорректный ввод")
        }
        print("$num")
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}