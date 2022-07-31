package backend;

import java.util.*;

public class guessTheNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1-100: ");
        int input = sc.nextInt();
        int number = (int)(Math.random() * 100 - 1) + 1;
        System.out.println(number);

        int attempts = 0;
        int totalAttempts = 4;

        while(attempts < totalAttempts){
            if(input == number){
                attempts++;
                System.out.println("Congratulations, You guessed in " + attempts + " attempts");
                break;
            }
            else if(input > number){
                attempts++;
                System.out.print("The number you entered is greater then that number, please enter again: ");
                input = sc.nextInt();
            }
            else {
                attempts++;
                System.out.print("The number you entered is less then that number, please enter again: ");
                input = sc.nextInt();
            }
        }
        if(input != number){
            System.out.println("👎 You loss! The number was " + number);
        }
    }
}
