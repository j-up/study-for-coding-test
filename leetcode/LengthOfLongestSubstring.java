class Solution {
    public int lengthOfLongestSubstring(String s) {
        int resultLength = 0;

        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                if(isUnique(s,i,j)) {
                    resultLength = Math.max(resultLength, j-i);
                }
            }
        }

        return resultLength;
    }

    private boolean isUnique(String str, int start, int end) {
        Set<Character> set = new HashSet<>();

        for(int i=start; i<end; i++) {
            Character value = str.charAt(i);
            if(set.contains(value)) return false;
            set.add(value);
        }

        return true;
    }
}