class Store {
    private val products = mapOf(
        1 to Product("Samsung Galaxy A11", 10450),
        2 to Product("Iphone 11 pro max", 50900),
        3 to Product("Xiaomi Redmi Note 12", 17900),
        4 to Product("POCO X4 GT", 31000),
        5 to Product("Techno Camon 17P", 16900),
        6 to Product("Infinix Zero X NEO", 12530),
        7 to Product("Realme GT 5G", 43900),
        8 to Product("Vivo Y36", 52190),
    )


    fun printAllProducts() {
        products.forEach { (id, product) ->
            println("ID: $id, Название: ${product.name}, Цена: ${product.price}")
        }
    }

    fun buy(productId: Int, user: User) {
        when (productId) {
            in products.keys -> {
                val product = products[productId]!!
                val totalPrice = product.price

                if (totalPrice <= user.balance) {
                    user.balance -= totalPrice

                    println("Вы купили: ${product.name}")
                    println("Списано с баланса: $totalPrice")
                    println("Адрес доставки: ${user.address}")
                    println("Остаток на балансе: ${user.balance}")
                } else {
                    println("Недостаточно средств на балансе")
                }
            }

            else -> {
                println("Вы ввели неверный ID товара")
            }
        }
    }
}
