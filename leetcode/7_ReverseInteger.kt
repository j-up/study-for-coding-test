class Solution {
    public int reverse(int x) {
        long sum=0;
        int booho = x>0?1:-1;
        x=Math.abs(x);
        int mul=(int)Math.log10(x);
        
        while(x>0){
            int remains = x%10;
            x = x/10;
            sum+=(remains*Math.pow(10,mul));
            if(sum>Integer.MAX_VALUE)
                return 0;
            mul--;
        }
        
        return (int)sum*booho;
    }
}