class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var left = 0
        var right = nums.size

        while(left < right) {
            val mid = left + (right - left) / 2

            if(nums[mid] >= target) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return if (left < nums.size && nums[left] == target) left else -1

    }
}
