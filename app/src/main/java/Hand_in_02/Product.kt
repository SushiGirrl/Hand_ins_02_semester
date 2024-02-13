package Hand_in_02

open class Product(name: String, price: Int, quantity: Int) {
    val name: String = name;
    var price: Int = price;
    var quantity: Int = quantity;
    open fun identifyProductCategory(){
        println("This needs to be overridden");
    }
}
/*
Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
Subclass it to create specific product types like Shoe, T-shirt, and Book.
Override the function such that:
The shoe outputs "I am a shoe" .
The T-shirt outputs "I am a T-shirt"
The book outputs "I am a book"
 */