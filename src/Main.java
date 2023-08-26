import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        guessTheNumber();
    }

    private static void guessTheNumber(){
        System.out.println("-*-Welcome to Number Guessing Game-*-");
        System.out.println();
        System.out.println("Tips:" +
                "\n\s(1)You will have 5 chances to guess the correct answer." +
                "\n\s(2)The range of numbers is 1 - 1000");

        System.out.println("\n\s\s\s\s\s\sGenerating Number...\n");
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int random = rand.nextInt(1000) + 1;
        int limit = 5;
        while(limit > 0){
            int guessed = 0;
            System.out.print("Guess The Number(Chances : " + limit +"): ");
            guessed = input.nextInt();

            if(guessed > random)
                System.out.println("Guessed number is higher than the actual number.");
            else if(guessed < random)
                System.out.println("Guessed number is lower than the actual number.");
            else{
                System.out.println("\n\s\s\s\s\s\sYOU WON!!!!");
                break;
            }

            limit--;
        }

        if(limit == 0)
            System.out.println("\n\s\s\s\s\s\s\s\s\sYOU LOST!!!!\n\s\s\s\s\s\sThe Number was "+ random);
    }
}