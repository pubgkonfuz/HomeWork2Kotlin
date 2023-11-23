import java.util.Scanner

fun main(args: Array<String>) {
    val store = Store()
    with(store) {
        val user = User("Toм", "Фрунзе 346").apply {
            balance = 10000
        }
        val scanner = Scanner(System.`in`)
        println("Товары:")
        println("----------------------------------------")
        store()
        println("----------------------------------------")
        print("Введите индекс товара: ")
        buy(scanner.nextInt(), user)
    }
}