import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Generate a number between range 1 to 100
        int c = 0;
        int LB= 1;   
        int UB = 100; 
        int RN = random.nextInt(UB - LB + 1) + LB; 
       
        
        System.out.println("I have picked a number between " + LB + " & " + UB + ". Try to guess.");
        

        while (true) {

            // Let user enter their guess.

            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            c++;
            
            //  Compare the user's guess with the generated number

               if(guess < RN)
                System.out.println("Too low! Try again.");
             else if (guess > RN) 
                System.out.println("Too high! Try again.");
             else {
                System.out.println("Congrats!!! You guessed the number " + RN + " in " + c + " attempts.");
                break;
            }
        }
        
        sc.close();
    }
}
