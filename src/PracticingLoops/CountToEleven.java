package PracticingLoops;
import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number less than 11: ");
        int num = scanner.nextInt();

        if (num < 11) {
            for (int i = num; i <= 11; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("The number entered is not less than 11.");
        }
    }
}
