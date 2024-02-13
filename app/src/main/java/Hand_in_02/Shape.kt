package Hand_in_02

abstract class Shape(color: String, isTransparent: Boolean) {
    val color: String = color;
    val isTransparent: Boolean = isTransparent;
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}