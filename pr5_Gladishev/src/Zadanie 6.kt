fun main() {
    try {
        var num1: Int
        print("Введите количесво доступных дней: ")
        num1 = readln()!!.toInt()
        var num2: Int
        print("Введите доступную сумму денег: ")
        num2 = readln()!!.toInt()
        println("\nВведите данные для 1 тура")
        var N1: Int
        print("Введите количесво дней: ")
        N1 = readln()!!.toInt()
        var D1: Int
        print("Введите стоимость тура: ")
        D1 = readln()!!.toInt()
        println("\nВведите данные для 2 тура")
        var N2: Int
        print("Введите количесво дней: ")
        N2 = readln()!!.toInt()
        var D2: Int
        print("Введите стоимость тура: ")
        D2 = readln()!!.toInt()
        println("\nВведите данные для 3 тура")
        var N3: Int
        print("Введите количесво дней: ")
        N3 = readln()!!.toInt()
        var D3: Int
        print("Введите стоимость тура: ")
        D3 = readln()!!.toInt()
        when {
            N1 <= num1 && D1 <= num2 -> println("\nВам подойдет Первый тур")
        }
        when {
            N2 <= num1 && D2 <= num2 -> println("\nВам подойдет Второй тур")
        }
        when {
            N3 <= num1 && D3 <= num2 -> println("\nВам подойдет Третий тур")
        }
    }
    catch (e: NumberFormatException)
    {
        println("Неверный формат данных")
    }
}