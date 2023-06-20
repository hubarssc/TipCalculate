package homework11

import kotlin.math.pow
import kotlin.math.sqrt
/**
 * Рассчитать расстояние между двумя окружностями.
 * Расстояние между непересекающимися окружностями рассчитывается как
 * расстояние между их центрами минус сумма их радиусов.
 * Расстояние между пересекающимися окружностями считать равным 0.0.
 */

    data class Point(val x: Double, val y: Double)

    data class Circle(val center: Point, val radius: Double) {

        fun distance(other: Circle): Double {
            val distanceBetweenCenters = sqrt(
                (center.x - other.center.x).pow(2) + (center.y - other.center.y).pow(2)
            )
            val totalRadius = radius + other.radius
            return when {
                distanceBetweenCenters > totalRadius -> distanceBetweenCenters - totalRadius
                else -> 0.0
            }
        }
    }

    fun main() {
        val circle1 = Circle(Point(0.0, 0.0), 2.0)
        val circle2 = Circle(Point(3.0, 0.0), 1.5)

        val distance = circle1.distance(circle2)
        println("Расстояние между окружностями: $distance")
    }