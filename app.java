import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, your age is " + age + "!");
        
        boolean hasDl = true; // Declared to fix the missing variable error

        if (age >= 18) {
            System.out.println("You are an adult.");
            if (hasDl) {
                System.out.println("You can drive.");
            }
        } else {
            System.out.println("You are a minor.");
        }
        scanner.close();
    }
}
