fun longestPalindrome(s: String): String {
        if(s.length == 1) {
            return s
        }

        dpValue = Array(s.length) {IntArray(s.length)}

        var result = ""

        for(i in s.indices) {
            for(j in i until s.length) {
                val len = j-i+1

                if(calc(s, i, j) == IS_PALINDROME) {
                    if(len > result.length) {
                        result = s.substring(i, j+1)
                    }
                }
            }
        }

        return result
    }

    private fun calc(s: String, start: Int, end: Int): Int {
        if(dpValue[start][end] != 0) {
            return dpValue[start][end]
        }

        if(start >= end) {
            return IS_PALINDROME
        }

        var isPalindrome = IS_NOT_PALINDROME

        if(s[start] == s[end]) {
            isPalindrome = calc(s, start+1, end-1)
        }

        dpValue[start][end] = isPalindrome

        return isPalindrome
    }

    companion object {
        lateinit var dpValue:Array<IntArray>
        private val IS_PALINDROME = 2
        private val IS_NOT_PALINDROME = 1
    }