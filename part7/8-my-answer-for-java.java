import java.util.*;

public class Main {
    public static void main(String[] args) {
        int count = 4;
        int target = 6;

        Integer[] array = {19, 15, 10, 17};

        Arrays.sort(array, Collections.reverseOrder());

        int max = array[0];

        for(; max>0; max--) {
            int result = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] > max) {
                    result = result + (array[i] - max);
                }
            }
            if (result==target) break;
        }
    }
}