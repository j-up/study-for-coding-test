import java.util.Arrays;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    Integer[] numbers = {3,4,3,4,3};

    int result = solution(5,7,2,numbers);
    System.out.println("result= " + result);
  }


  static int solution(int length, int addCount, int addIndexMax, Integer[] numbers) {
    int result = 0;
    // 역순 정렬은 Collections.reversOrder()를 사용하고 Wrapper클래스인 Integer를 사용해야함
    Arrays.sort(numbers, Collections.reverseOrder());

    if(numbers[0] == numbers[1]) {
      for(int i=0; i<addCount; i++) {
        result = result + numbers[0]; 
      }
      return result;
    } else {
      int maxIndex = 0;
      for(int i=0; i<addCount; i++) { 
        if(maxIndex<addIndexMax) {
          result = result + numbers[0];
          maxIndex++;
        } else {
          result = result + numbers[1];
          maxIndex = 0;
        }
      }
      return result;
    }
  }
}