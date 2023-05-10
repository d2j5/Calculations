package PracticingLoops;
import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = scanner.nextInt();

        while (num != 5) {
            System.out.println("Give another number:");
            num = scanner.nextInt();
        }

        System.out.println("You win, the secret number was 5!");
    }
}
