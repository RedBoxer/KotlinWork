package complexNum

import complexNum.complexNum
import kotlin.math.*

class complexNum(var a: Double, var b: Double) {
    fun sum(secondNum: complexNum): complexNum {
        return complexNum(a + secondNum.a,
                b + secondNum.b)
    }

    fun sub(secondNum: complexNum): complexNum {
        return complexNum(a - secondNum.a,
                b - secondNum.b)
    }

    fun mul(secondNum: complexNum): complexNum {
        return complexNum(a * secondNum.a +
                b * secondNum.b * -1,
                a * secondNum.b +
                        b * secondNum.a)
    }

    operator fun div(secondNum: complexNum): complexNum {
        val temp = complexNum(secondNum.a, secondNum.b * -1)
        val upper = mul(temp)
        val lower = secondNum.mul(temp)
        return complexNum(upper.a / lower.a, upper.b / lower.a)
    }

    override fun toString(): String {
        if (b == 0.0) {
            return a.toString()
        }
        return if (b > 0) {
            a.toString() + "+" + b.toString() + "i"
        } else {
            a.toString() + b.toString() + "i"
        }
    }

    fun toStringTri(): String {
        //r = |complexNum|
        val r: Double = sqrt(a * a + b * b)
        val fi: Double = atan(b / a)
        val sifi = sin(fi)
        val cofi = cos(fi)
        return "$r($sifi + i$cofi)"
    }
}