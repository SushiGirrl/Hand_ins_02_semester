package Hand_in_02

import kotlin.math.sqrt

class Triangle(color: String, isTransparent: Boolean, a: Double, b: Double, c: Double): Shape(color, isTransparent) {

    private val a: Double = a;
    private val b: Double = b;
    private val c: Double = c;

    override fun calculatePerimeter(): Double {
        return a + b + c;
    }

    override fun calculateArea(): Double {
        val s: Double = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }
}