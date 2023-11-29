class Store : Buyable{
    private val products = mutableMapOf(
        Pair(1, Product("Кетчуп", 100)),
        Pair(2, Product("Хлеб", 20)),
        Pair(3, Product("Кола", 130)),
        Pair(4, Product("Сендвич", 75)),
        Pair(5, Product("Гамбургер", 120)),
        )
    fun store() {
        var productsSize = 1
        while (productsSize <= products.size) {
            println("$productsSize = ${products[productsSize]}")
            productsSize++
        }
    }

    override fun buy(id: Int, user: User) {
        var userBalance = user.balance
        when (id) {
            1,2,3,4,5 -> {
                products[id]?.apply {
                    println("Вы приобрели: $name")
                    println("С вашего баланса списано: $price")
                    userBalance -= price
                    println("Благодарим за покупку!")
                    println("Ваш товар был отправлен по адрессу: " + user.address)
                    println("\nВаш баланс: " + userBalance)
                }
            }

            else -> {
                println("Вы ввели неверный id товара")
            }
        }
    }
}