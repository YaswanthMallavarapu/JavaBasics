import java.util.*;

public class Program10 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 0, 1, 1 };
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }

        even.addAll(odd);
        System.out.println(even);
    }
}
