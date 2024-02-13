package Hand_in_02

class Rectangle(color: String, isTransparent: Boolean, width: Double, height: Double): Shape(color, isTransparent) {
    private val width: Double = width;
    private val height: Double = height;

    override fun calculatePerimeter(): Double {
        return 2 * height + 2 * width;
    }

    override fun calculateArea(): Double {
        return height * width;
    }
}