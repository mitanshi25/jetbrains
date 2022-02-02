package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders
        int remaineder3 = scanner.nextInt();
        int remaineder5 = scanner.nextInt();
        int remaineder7 = scanner.nextInt();
        int yourage;
        yourage = (remaineder3*70 + remaineder5*21+remaineder7*15)%105;

        System.out.println("Your age is " + yourage + " ; that's a good time to start programming!");
        boolean c = 'true';
    }
}
