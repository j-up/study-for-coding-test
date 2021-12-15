import kotlin.math.*
import java.lang.Math.pow

class Solution {
    fun reverse(x: Int): Int {
        var x = x
        var sum: Long = 0
        val booho = if (x > 0) 1 else -1
        x = abs(x)
        var mul = log10(x.toDouble()).toInt()
        while (x > 0) {
            val remains = x % 10
            x = x / 10
            sum = sum + (remains * pow(10.0, mul.toDouble())).toLong()
            if (sum > Int.MAX_VALUE) return 0
            mul--
        }
        return sum.toInt() * booho
    }
}