public class Program15 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter an integer number");
            return;
        }

        int rows = Integer.parseInt(args[0]);
        int i = 1;
        int count = 1;

        while (i <= rows) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                count++;
            }
            System.out.println();
            i++;
        }
    }
}
