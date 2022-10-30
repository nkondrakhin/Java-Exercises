package OOP.AliceExercise;
import java.util.Scanner;

public class AliceDemo {
    public static void main(String[] args) {
        System.out.println("Hello, Alice!\nPlease enter your height:");

        Scanner sc = new Scanner(System.in); //setting up scanner
        double height = sc.nextDouble();

        Alice alice = new Alice(); //creating new object

        alice.setHeight(height);
        System.out.println("Your height is: " + alice.getHeight());

        alice.setHeight(height + 10);
        System.out.println("Alice drank the growth potion, now her height is " + alice.getHeight());
    }
}