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
        // For each loop and for loop
        String[] fruits ={"Apple", " mango", "Banana"};

    /*    for (int i = 0; i < fruits.length; i++) ;
        System.out.println(fruits[i]); */
// Another way to write this code
        for (String fruit : fruits);
        System.out.println(fruits);
    }
}