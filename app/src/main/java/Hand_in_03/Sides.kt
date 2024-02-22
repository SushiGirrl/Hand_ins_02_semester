package Hand_in_03

class Sides(
    override val name: String,
    override val price: Double,
    override val number: Int
    ): FastFood {
    override fun order(): String {
        return "Ordered $name";
    }

    override fun pay(): String {
        return "Payed for $name";
    }
}