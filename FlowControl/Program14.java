public class Program14 {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
