import java.util.*
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin

const val a = 3.2e-5
const val b = (PI) * 10e-7

fun main() {
    val scanner = Scanner(System.`in`)

    try {
        print("Введите число ")
        val x = scanner.nextInt()

        val y = (x * x + b).pow(1 / 3) - b * b * sin((x + a) / x).pow(3)
        val z = (a.pow(2 * x) + b.pow(-x) * cos(a + x.toDouble().pow(y))) / y.pow(x)

        print("x = $x\ny = $y\nz = $z")
    } catch (ex: InputMismatchException) {
        print("Ты еблан?")
    }
}