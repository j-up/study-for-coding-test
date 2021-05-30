class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows==1){
            return s;
        }
        
        int space = (numRows-1)*2;
        int length = s.length();
        String ret = "";
       
        for(int i=0; i<length; i=i+space) {
            ret = ret + s.charAt(i);
        }
        
        int space2 = space;
        int space3 = 0;
        
        for(int i=1; i<numRows-1; i++) {
            space2 = space2 - 2;
            space3 = space3 + 2;
            boolean toogle = true;
            
            for(int j=i; j<length;) {
                
                ret = ret + s.charAt(j);
                
                if(toogle) {
                    j = j+space2;    
                } else {
                    j = j+space3;
                }
                toogle = !toogle;
            }    
        }
        
        for(int i=numRows-1; i<length; i=i+space) {
            ret = ret + s.charAt(i);
        }
        
        return ret;   
    }
}