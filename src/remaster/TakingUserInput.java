package remaster;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner object

        System.out.println("Enter your birth year : ");
        int birthYear = sc.hasNextInt() ? sc.nextInt() : 0;
        int age = LocalDateTime.now().getYear() - birthYear;

        sc.nextLine(); // to capture enter key (after entering integer)

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        sc.close(); // can not instantiate 'sc' after invoking close()

        System.out.println("Your name is " + name + ".");
        if (age >= 0 && age <= 100)
            System.out.println("You are " + age + " years old.");
        else
            System.out.println("Invalid year of birth!");
    }
}
