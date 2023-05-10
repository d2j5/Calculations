package PracticingLoops;
import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response = "";

        while (!response.equals("yes")) {
            System.out.println("Do you want to take a break?");
            response = input.nextLine();
        }
        System.out.println("Great! Take a break!");
    }

}
