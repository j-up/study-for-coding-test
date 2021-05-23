    fun findMedianSortedArrays(nums1: Array<Int>, nums2: Array<Int>): Double {
        var mergeArray = Array(nums1.size + nums2.size) {0}

        for (i in nums1.indices) {
            mergeArray[i] = nums1[i]
        }

        for(i in  nums2.indices) {
            mergeArray[nums1.size + i] = nums2[i]
        }

        mergeArray.sort()

        return if (mergeArray.size % 2 == 0) {
            (mergeArray[mergeArray.size / 2 - 1] + mergeArray[mergeArray.size / 2]) / 2.0
        } else {
            mergeArray[mergeArray.size / 2].toDouble()
        }
    }