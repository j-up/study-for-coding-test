import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 4;
        int target = 6;

        Integer[] array = {19, 15, 10, 17};

        Arrays.sort(array, Collections.reverseOrder());
        int end = array[0];

        int result = binaryTree(array, target, 0, end);

        System.out.println(result);
    }

    public static int binaryTree(Integer[] array,int target, int start, int end) {
        int result = 0;
        while(start < end) {
            int mid = (start + end) / 2;

            int total = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] > mid) {
                    total = total + (array[i] - mid);
                }
            }

            if(total>target) {
                start = mid +1;
            } else {
                result = mid;
                end = mid - 1;
            }
        }

        return result;
    }
}