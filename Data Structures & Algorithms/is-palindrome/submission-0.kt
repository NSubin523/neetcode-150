class Solution {
    fun isPalindrome(s: String): Boolean {

        var leftPointer = 0
        var rightPointer = s.length - 1

        while (leftPointer < rightPointer) {

            while(leftPointer < rightPointer && !s[leftPointer].isLetterOrDigit()) {
                leftPointer++
            }
            while(leftPointer < rightPointer && !s[rightPointer].isLetterOrDigit()) {
                rightPointer--
            }
            if(s[leftPointer].lowercaseChar() != s[rightPointer].lowercaseChar()) {
                return false
            }
            leftPointer++
            rightPointer--
        }

        return true

    }
}
