package Hand_in_03
fun main() {

    /*
    1.
    Write a class: Article
    An article has an author and a title
    Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
    */
    val article1: Article = Article("Winter depression id real", "Someone With Winter Depression");
    val article2: Article = Article("Psychological Security Success", "A Team Leader");
    val article3: Article = Article("Why do I need to create five?", "Me");
    val article4: Article = Article("I really don´t know", "Also me");
    val article5: Article = Article("This is the last one", "still me");

    val articleArrayList: ArrayList<Article> = arrayListOf(article1, article2, article3, article4, article5);
    println(articleArrayList);

    /*
    2.
    Create an interface called FastFood (with appropriate methods)
    and create a Sandwich class, a Pizza class and a class you decide
    that implements the FastFood interface.
    Add some different Fastfood objects to an array.
    Now iterate through that array and use some of the methods you have created above.
    */

    /*
    3.
    Create a class that implements the following interface. Now create two objects using the class created
    interface Vehicle {
        changeGear(int a);
        speedUp(int a);
        applyBrakes(int a);
    }
    4.
    Write a class: RedditPost
    A Redditpost has :
    A date of which is has been posted
    An author
    A balance of upvotes / downvotes
    A Title
    When a new instance of RedditPost is instantiated:
    The current date will be generated.
    The balance of upvotes and downvotes starts at 1.
    The title and author has to be provided by the constructor.
    Ensure all attributes are private, but accesible by getters & setters.
    Implement functionality such that redditposts can be sorted by upvotes/downvotes
    4.5
    Write a class: RedditFrontPage
    The RedditFrontPage has:
    A List of all RedditPosts
    A method in RedditFrontPage deletes a RedditPost from the list, by its index number
    5.
    Write a program that takes a list of words as input and prints the frequency of each word.
    Hint: Use a MutableMap
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")
    Advanced (Optional)
    6.
    Create a product inventory system where each product has a name and a quantity. Implement functions to add products, remove products, and display the current inventory.
     */
}