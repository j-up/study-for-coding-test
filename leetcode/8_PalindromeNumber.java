class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }

        int reversNumber = 0;
        int remainder = 0;
        int original = x;

        while(x!=0) {
            remainder = x % 10;
            reversNumber = reversNumber * 10 + remainder;
            x = x/10;
        }

        return original == reversNumber;
    }
}