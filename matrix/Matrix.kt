package matrix



open class Matrix<P>(var hight: Int, var length: Int) {
    var matrix: MutableList<MutableList<P>> = MutableList<MutableList<P>>()
    fun transp() {
        var temp: P
        var curPos = 0
        for (i in 0 + curPos until hight) {
            for (i2 in 0 + curPos until length) {
                temp = matrix[i][i2]
                matrix[i][i2] = matrix[i2][i]
                matrix[i2][i] = temp
            }
            curPos++
        }
    }

    override fun toString(): String {
        var temp = ""
        for (i in 0 until hight) {
            for (i2 in 0 until this@Matrix.length) {
                temp += matrix[i][i2].toString()
                temp += (" ")
            }
            temp += ("\n")
        }
        return temp;
    }

    init {
        for (i in 0 until hight) {
            matrix.add(MutableList<P>())
        }
    }
}