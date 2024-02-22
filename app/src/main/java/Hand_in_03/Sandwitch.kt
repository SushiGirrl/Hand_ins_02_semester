package Hand_in_03

class Sandwitch(
    override val name: String,
    override val number: Int,
    override val price: Double,
    val fillings: List<String>
): FastFood {
    override fun order(): String {
        return "Ordered $name";
    }

    override fun pay(): String {
        return "Payed for $name";
    }
}