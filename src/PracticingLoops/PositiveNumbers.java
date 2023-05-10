package PracticingLoops;
import java.util.Scanner;
public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number must be a positive number.");
            } else if (number == 0) {
                System.out.println("Game Over!");
                break;
            } else {
                System.out.println("Number is: "+number);
            }
        }

    }
}

