package matrix

import java.util.Random

class IntMatrix(hight: Int, length: Int) : Matrix<Integer?>(hight, length) {
    fun randFill() {
        val r = Random()
        for (i in 0 until hight) {
            for (i2 in 0 until length) {
                matrix[i].set(i2, r.nextInt() % 100)
            }
        }
    }
}