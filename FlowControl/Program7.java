public class Program7 {
    public static void main(String[] args) {
        char ch = 'A';

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char) (ch - 32);
            System.out.println(ch + "->" + upper);
        } else if (ch >= 'A' && ch <= 'Z') {
            char lower = (char) (ch + 32);
            System.out.println(ch + "->" + lower);
        } else {
            System.out.println("Invalid character");
        }
    }
}
