package Hand_in_03

class Article(title: String, author: String) {
    val title: String = title;
    val author: String = author

    override fun toString(): String {
        return title + " By: " + author;
    }
}