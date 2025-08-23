package Map;
import java.util.*;
public class SubarraySum_0 {
    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                int j = map.get(sum);
                len = Math.max(len,  i - j);
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(len);
    }
}
