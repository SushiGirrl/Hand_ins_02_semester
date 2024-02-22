package Hand_in_03

class Pizza(
    override val name: String,
    override val number: Int,
    override val price: Double,
    val toppings: List<String>
): FastFood {
    override fun order(): String {
        return "Ordered $name";
    }

    override fun pay(): String {
        return "Payed for $name";
    }
}