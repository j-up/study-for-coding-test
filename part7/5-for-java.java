import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer[] items = {8, 3, 7, 9, 2};
        Integer[] targetItems = {5, 7, 9};
        String[] resultArray = new String[targetItems.length];

        Arrays.sort(items);

        for(int i = 0; i<targetItems.length; i++) {
            resultArray[i] = binarySearch(items, targetItems[i], 0, items.length);
        }
        System.out.println(Arrays.toString(resultArray));

        for(int j = 0; j<resultArray.length; j++) {
            System.out.print(resultArray[j]);
        }
    }

    public static String binarySearch(Integer[] array, int target, int start, int end) {
        while(start<end) {
            int mid = (start+end) / 2;

            if(array[mid] == target) return "yes";

            else if(array[mid] > target) end = mid - 1;

            else start = mid + 1;
        }

        return "no";
    }

}