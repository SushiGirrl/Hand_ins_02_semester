package Hand_in_03

interface FastFood {
    val name: String;
    val price: Double;
    val number: Int;
    fun order(): String;
    fun pay(): String;
}