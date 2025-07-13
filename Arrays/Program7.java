import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
