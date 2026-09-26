class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if(nums.size <=0) return false

        var mSet = mutableSetOf<Int>()

        nums.map { num ->
            mSet.add(num)
        }

        return mSet.size != nums.size
    }
}
