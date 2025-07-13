public class Program3 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            // Join and print values comma-separated
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                result.append(args[i]);
                if (i < args.length - 1) {
                    result.append(", ");
                }
            }
            System.out.println(result.toString());
        }
    }
}
