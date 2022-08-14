import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*    for (int i = 5; i > 0; --i) {
        }
     System.out.println("Hello world!" + i);
        int i = 0;
        while (i > 0) {
            System.out.println("Hello world!" + i);
            i--;
        } */
    // To quit something in while loop just use this
        Scanner scanner = new Scanner(System.in);

        String input = "";
                while (!input.equals("quit")) {
                    System.out.println("Input: ");
                    input = scanner.next().toLowerCase();
                    System.out.println(input);
                }
    }
}