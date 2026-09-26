class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        if(nums.size <= 1) return intArrayOf()

        val prevMap = mutableMapOf<Int, Int>()

        for((i,n) in nums.withIndex()) {
            val diff = target - n

            if(prevMap.containsKey(diff)) {
                return intArrayOf(prevMap[diff]!!, i)
            }
            prevMap[n] = i
        }

        return intArrayOf()
    }
}
