fun lengthOfLongestSubstring(s: String): Int {
        if(s.length == 1) return 1

        var maxLength = 0

        val countMap: HashMap<Char, Int> = HashMap()

        for(i in s.indices) {
            var count = 0
            countMap.clear()

            for(j in i until s.length) {
                countMap[s[j]] = countMap.getOrDefault(s[j], 0) + 1

                if(countMap[s[j]]!=2) {
                    count++
                } else {
                    break
                }
            }

            maxLength = max(count, maxLength)
        }

        return maxLength
}