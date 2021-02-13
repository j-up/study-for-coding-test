import java.util.*;

public class Main {
    public static void main(String[] args) {
      int result = 0;

      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      int k = sc.nextInt();
      
      Integer[] a = new Integer[count];
      Integer[] b = new Integer[count];
      
      for(int m=0; m<count; m++) {
        a[m] = sc.nextInt();
      }
      
      for(int n=0; n<count; n++) {
        b[n] = sc.nextInt();
      }
    
      Arrays.sort(a);
      Arrays.sort(b,Collections.reverseOrder());

      int i = 0;
      while(k>0) {
        if(a[i] < b[i]) {
          int temp = a[i];
          a[i] = b[i];
          b[i] = temp;
          k--;
        } else {
		  break; 
		}

        i++;  

        if(i == a.length) break;
      }

	  /* 풀이의 방법이 더 직관적이고 퍼포먼스도 더 좋음
		 for (int i = 0; i < k; i++) {
            // A의 원소가 B의 원소보다 작은 경우
            if (a[i] < b[i]) {
                // 두 원소를 교체
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            // A의 원소가 B의 원소보다 크거나 같을 때, 반복문을 탈출
            else break;
        }
	  */

      for(int j=0; j<a.length; j++) {
          result += a[j];
      }

      System.out.println(result);
      
    }
}