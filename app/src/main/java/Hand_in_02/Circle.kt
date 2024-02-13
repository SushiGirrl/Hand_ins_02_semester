package Hand_in_02

import kotlin.math.PI

class Circle(color: String, isTransparent: Boolean, r: Double): Shape(color, isTransparent) {

    private val r: Double = r;
    override fun calculatePerimeter(): Double {
        return 2 * PI * r;
    }

    override fun calculateArea(): Double {
        return PI * r * r;
    }
}