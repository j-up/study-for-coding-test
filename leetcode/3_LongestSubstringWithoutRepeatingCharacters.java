import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) {
            return 1;
        }
        
        int maxLength = 0;
        int count = 0;
       
        HashMap<Character, Integer> countMap = new HashMap();
        
        
        for(int i=0; i<s.length(); i++) {
            count = 0;
            countMap.clear();
            for(int j=i; j<s.length(); j++) {
                char temp = s.charAt(j);
            
                countMap.put(temp, countMap.getOrDefault(temp,0) + 1);
                if(countMap.get(temp)!=2) {
                    count++;
                    maxLength = Math.max(count, maxLength);
                } else {
                    break;
                }
            }
        }
    
        return maxLength;
    }
}