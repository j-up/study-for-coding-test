import java.util.*;

public class Main {
    public static void main(String[] args) {
        int result = 0;

        Integer[] a = {6,7,3,2,1,8,9,4};
        // 이진 탐색은 반드시 정렬되어있어야함
        Arrays.sort(a);

        result = binarySearch(a, 4, 0, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(result);

    }
    /*
    이진 탐색 (재귀)
     */
    public static int binarySearch(Integer[] array, int target, int start, int end) {
        if(start>end) return -1;

        int mid = (start+end) / 2;

        if(array[mid]==target) return mid;

        else if(array[mid] > target) return binarySearch(array, target, start, mid-1);

        else return binarySearch(array, target, mid+1, end);
    }

    /*
    이진 탐색 (반복문)
     */
    public static int binarySearch(Integer[] array, int target, int start, int end) {

        while(start<=end) {
            int mid = (start+end) / 2;
            if(array[mid] == target) return mid;

            else if(array[mid] > target) end = mid -1;

            else if(array[mid] < target) start = mid +1;
        }

        return -1;
    }
}