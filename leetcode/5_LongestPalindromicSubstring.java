class Solution {
    private static int dpValue[][];
    private final static int IS_PALINDROME = 2;
    private final static int IS_NOT_PALINDROME = 1;
        
    public String longestPalindrome(String s) {    
        if(s.length() == 1) {
            return s;
        }
        
        String result = "";
        dpValue = new int[s.length()][s.length()];
        
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                int len = j-i+1;
                int calcResult = calc(s, i, j);
                
                if(calcResult == IS_PALINDROME) {
                    if(len > result.length()) {
                        result = s.substring(i,j+1);
                    }
                }
                
            }
        } 
    
        return result; 
    }
    
    public static int calc(String s, int start, int end) {
        if(start>=end) {
            return IS_PALINDROME;
        }
        
        if(dpValue[start][end] != 0) {
            return dpValue[start][end];
        } 
        
        int isPealindrome = IS_NOT_PALINDROME;
        
        if(s.charAt(start) == s.charAt(end)) {
            isPealindrome = calc(s, start+1, end-1);
        }
        
        dpValue[start][end] = isPealindrome;
        
        return isPealindrome;
    }
}