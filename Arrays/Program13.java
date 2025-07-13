public class Program13 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] matrix = new int[2][2];
        for (int i = 0; i < 4; i++) {
            matrix[i / 2][i % 2] = Integer.parseInt(args[i]);
        }

        System.out.println("The given array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] reversed = new int[2][2];
        for (int i = 0; i < 4; i++) {
            reversed[i / 2][i % 2] = Integer.parseInt(args[3 - i]);
        }

        System.out.println("The reverse of the array is:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(reversed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
