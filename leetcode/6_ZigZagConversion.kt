class Solution {
    fun convert(s: String, numRows: Int): String? {
        if (numRows == 1) {
            return s
        }
        val space = (numRows - 1) * 2
        var ret = ""

        for (i in s.indices step space) {
            ret = ret + s[i]
        }

        var space2 = space
        var space3 = 0

        for (i in 1 until numRows - 1) {
            space2 = space2 - 2
            space3 = space3 + 2

            var toogle = true
            var j = i

            while (j < s.length) {
                ret = ret + s[j]
                j = if (toogle) {
                    j + space2
                } else {
                    j + space3
                }
                toogle = !toogle
            }
        }

        var i = numRows - 1
        while (i < s.length) {
            ret = ret + s[i]
            i = i + space
        }
        return ret
    }
}