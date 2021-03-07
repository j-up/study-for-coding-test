cimport java.util.*;

public class Main {
    static int[] arr = {1, 3, 1, 5, 7, 4};
    public static int[] d = new int[arr.length+1];

    public static void main(String[] args) {
        int n = arr.length;

        // 다이나믹 프로그래밍(Dynamic Programming) 진행(보텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }

        // 계산된 결과 출력
        System.out.println(d[n - 1]);
        System.out.println(Arrays.toString(d));
    }
}