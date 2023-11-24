data class Product(
    var name: String, var price: Int
)

interface Buyable {
    fun buy(productId: Int, user: User)
}


