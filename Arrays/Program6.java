import java.util.Arrays;

public class Program6 {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 5, 67, 89, 1 };
        Arrays.sort(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
