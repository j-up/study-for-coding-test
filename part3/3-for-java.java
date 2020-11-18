import java.util.*;

public class Main {

    public static void main(String[] args) {
        int m = 3;
        int n = 3;

        int array[][] = { {3,1,2}
                ,{4,1,4}
                ,{2,2,2}
        };

        int max = 0;

        for(int i=0; i<array.length; i++) {
            int tempMin = 9999;
            // 각 행에서 가장 작은 수 확인
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j] <= tempMin) {
                    tempMin = array[i][j];
                }
            }
            System.out.println("tempMin=" + tempMin);
            // 다른 행의 큰 값과 비교
            if(tempMin>=max) {
                max = tempMin;
            }
        }
        System.out.println(max);
    }

}