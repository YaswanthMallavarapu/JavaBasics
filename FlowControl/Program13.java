public class Program13 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
}
