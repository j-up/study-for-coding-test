import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        String input = sc.nextLine();
       
        int x = input.charAt(0) - 'a' + 1;
		int y = input.charAt(1) - '0';
        //int y = Character.getNumericValue((input.charAt(1)));
        
        result = result + suZicMove(x,y);
        result = result + suPungMove(x,y);
  
        System.out.println("x=" + x + " y=" + y);
        System.out.println("result="+result);
    }

    static int suZicMove(int x, int y) {
      int result = 0;

      if(x-2>= 1 && y+1 <= 8) {
        result++;
      }

      if(x-2>= 1 && y-1 >= 1) {
        result++;
      }

      if(x+2<= 8 && y+1 <= 8) {
        result++;
      }

      if(x+2<= 8 && y-1 >= 1) {
        result++;
      }

      return result;
    }

    static int suPungMove(int x, int y) {
      int result = 0;

      if(y-2>= 1 && x+1 <= 8) {
        result++;
      }

      if(y-2>= 1 && x-1 >= 1) {
        result++;
      }

      if(y+2<= 8 && x+1 <= 8) {
        result++;
      }

      if(y+2>= 1 && x-1 >= 1) {
        result++;
      }

      return result;
    }

}
