import java.util.*;

public class Main {
    private static final int target = 10;
    public static int[] d = new int[target+1];

    public static void main(String[] args) {
        int x = target;

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        for (int i = 2; i <= x; i++) {
            if(i==target) {
                System.out.println(d[i-1]+1);
            }
            // 현재의 수에서 1을 빼는 경우
            /*
            현재 수가 10이라면 바로 전 인덱스에 9에서 1이 되기 위한 연산의 횟수가 저장되어 있다.
            그렇기에 9에서 1이 되기 위한 연산의 횟수 + 현재의 수에서 1을 빼는 연산 횟수를 더한다.
            */
            d[i] = d[i - 1] + 1;

            // 현재의 수가 2로 나누어 떨어지는 경우
            /*
            위에서 선택한 1을 빼는 방법의 연산 횟수와 i를 2로 나눴을때의 연산 횟수를 비교한다.
            위와 동일하게 현재 수가 10이라면 10을 2로나눴을때 5가 되는데 d[i/2] -> d[5]에는
            5에서 1이 되기 위한 연산의 횟수가 저장되어있다. 여기에 현재의 수에서 2를 나누는 연산 횟수를 더한다.
            */
            if (i % 2 == 0) {
                if (i == target) System.out.println("i%2 - 1 : " + d[i]);
                if (i == target) System.out.println("i%2 - 2 : " + (d[i / 2] + 1));
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            // 현재의 수가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                if (i == target) System.out.println("i%3 - 1 : " + d[i]);
                if (i == target) System.out.println("i%3 - 2 : " + (d[i / 3] + 1));
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
            // 현재의 수가 5로 나누어 떨어지는 경우
            if (i % 5 == 0) {
                if (i == 25) System.out.println("i%5 - 1 : " + d[i]);
                if (i == 25) System.out.println("i%5 - 2 : " + d[i / 5] + 1);
                d[i] = Math.min(d[i], d[i / 5] + 1);
            }
        }

        for(int j=0; j<d.length; j++) {
            System.out.println("d[" + j + "] = " + d[j]);
        }
    }
}