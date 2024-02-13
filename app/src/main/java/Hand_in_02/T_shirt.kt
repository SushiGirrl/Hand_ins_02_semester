package Hand_in_02

class T_shirt(name: String, price: Int, quantity: Int): Product(name, price, quantity) {

    override fun identifyProductCategory() {
        println("I am a T-shirt");
    }
}