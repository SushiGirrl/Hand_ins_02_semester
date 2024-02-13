package Hand_in_02

/*
1.
Create a class called Employee that includes three pieces of information as instance variables
A first name
A last name
A monthly salary

Your class should have a constructor that initializes the three instance variables.
If the monthly salary is not positive, set it to 0.0.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/
fun main() {
    val ben: Employee = Employee("Ben", "Brady", 23000.0);
    val sara: Employee = Employee("Sara", "Seuvee", 31000.0);
    println("Bens yearly salary: " + (ben.salary * 12));
    println("Saras yearly salary: " + (sara.salary * 12));
    println("After 10% raise:");
    println("Bens yearly salary: " + (ben.salary * 12) * 1.1)
    println("Saras yearly salary: " + (sara.salary * 12) * 1.1);

    println("\n");
    val bensLaptop: Laptop = Laptop("Lenovo", "EW12356jk345", 1000, 1.9);
    val sarasSmartphone: Smartphone = Smartphone("Google", "YU34522io234", 500, 48);

    println(bensLaptop.isLidOpen);
    sarasSmartphone.takePhoto();

    println("\n")
    val book: Book = Book("Math", 100, 50);
    book.identifyProductCategory();

    println("\n");
    val triangle: Triangle = Triangle("blue", false, 4.5, 6.7, 8.1);
    val  rectangle: Rectangle = Rectangle("green", true, 12.3, 7.8);
    val circle: Circle = Circle("red", false, 6.5);

    println("triangle perimeter: " + triangle.calculatePerimeter())
    println("triangle area: " + triangle.calculateArea());
    println("rectangle perimeter: " + rectangle.calculatePerimeter());
    println("rectangle area: " + rectangle.calculateArea());
    println("circle perimeter: " + circle.calculatePerimeter());
    println("circle area: " + circle.calculateArea());

}
/*
2.
Create a new class called Computer.
Before you add any more code, know that you will need to add two additional classes:
Laptop and SmartPhone
For a parent class add 3 properties, 2 methods, and a constructor.
For a child class add at least 1 additional property and 1 additional method.
In the main method create a Laptop and a SmartPhone
3.
Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
Subclass it to create specific product types like Shoe, T-shirt, and Book.
Override the function such that:
The shoe outputs "I am a shoe" .
The T-shirt outputs "I am a T-shirt"
The book outputs "I am a book"
4.
Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.
Every shape has two attributes
color
isTransparent
Furthermore every class has private attributes to calculate perimeter and area for each shape.
E.g. a Rectangle has the attributes: height, width, color & isTransparent
The attributes are set in the constructor
The 3 classes all overrides the following abstract methods from their parent class:
calculatePermeter
calculateArea
The functions will return the permeter or area of the shape.

Autoshop - optional
Car
Create a super class called Car. The Car class has the following fields and methods.
speed
regularPrice
color
getSalePrice()
Truck
Create a sub class of Car class and name it as Truck. The Truck class has the following fields and methods.
weight
getSalePrice()
If the weight of a Truck is more than 2000 kg then there is a discount of 10% otherwise 20%
Ford
Create a subclass of Car class and name it as Ford. The Ford class has the following fields and methods
year
manufacturerDiscount
getSalePrice()
If a manufacturerDiscount is set then the salesPrice will be that much cheaper
AutoShop
Create AutoShop class which contains the main() method. Perform the following within the main() method.
Create an instance of Truck class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the superclass.
Create two instances of the Ford class and initialize all the fields with appropriate values.
Use super(...) method in the constructor for initializing the fields of the super class.
Create an instance of Car class and initialize all the fields with appropriate values.
Display the sale prices of all instances.
 */