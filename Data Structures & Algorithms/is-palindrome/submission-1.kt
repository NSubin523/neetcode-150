class Solution {
    fun isPalindrome(s: String): Boolean {

        var newString = ""

        for(c in s) {
            if(c.isLetterOrDigit()) {
                newString += c.lowercaseChar()
            }
        }

        return newString == newString.reversed()
    }
}
