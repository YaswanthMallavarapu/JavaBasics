import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 2, 78, 23, 89 };
        Arrays.sort(arr);
        System.out.println("Smallest: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest: " + arr[arr.length - 2] + ", " + arr[arr.length - 1]);
    }
}
