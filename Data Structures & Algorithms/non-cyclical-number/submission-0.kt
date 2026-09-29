class Solution {
    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var num = n

        while (num != 1) {
            if (num in seen) return false
            seen.add(num)

        var currSum = 0
        for (digit in num.toString()) {
            val d = digit.digitToInt()
            currSum += d * d
        }

        num = currSum
    }

        return true
    }
}
