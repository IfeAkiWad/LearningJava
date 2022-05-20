import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Hello, friend");

            String userInput = obj.nextLine();
            System.out.println(userInput);
        }
    }
}
