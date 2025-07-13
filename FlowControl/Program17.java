public class Program17 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int original = num;
        int rev = 0;

        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}
