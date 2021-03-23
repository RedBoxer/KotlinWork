package complexMatrix

import complexNum.complexNum
import matrix.Matrix

class ComplexMatrix(hight: Int, length: Int) : Matrix<complexNum?>(hight, length) {
    fun randFill() {
        val r = (0..100).random()
        for (i in 0 until this.hight) {
            for (i2 in 0 until this.length) {
                this.matrix[i][i2] = complexNum((0..100).random().toDouble(), (0..100).random().toDouble())
            }
        }
    }
}