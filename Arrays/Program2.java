public class Program2 {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 12, 78, 56 };
        int max = arr[0], min = arr[0];

        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
