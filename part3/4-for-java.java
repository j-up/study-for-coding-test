import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int k = sc.nextInt();
    int result = 0;

    while(num!=1) {
      if(num%k==0) {
        num = num / k;
      } else {
        num= num -1;
      }
      result++;
    }
    
    System.out.println("result= " + result);
  }

}