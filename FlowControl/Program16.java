public class Program16 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
