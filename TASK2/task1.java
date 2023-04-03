import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("======NUMBER GUESSING GAME======");
    }

    public int computerNo(){
        return computer;
    }
}

public class task1{
    static int takeUserInput(){
        int user;
        System.out.println("Guess the number (1-100) : ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("You guessed it right. The number is " + i + ".");
        }
        else if(i>j){
            System.out.println("Your number is greater than the actual number ");
        }
        else{
            System.out.println("Your number is less than the actual number ");
        }
    }

    public static void main(String[] args) {
        int user = 0, computer = 0, iteration = 0;
        Game g = new Game();

        do{
            user = takeUserInput();
            computer = g.computerNo();
            isCorrectNumber(user, computer);
            iteration++;
        }while(user != computer);
        System.out.print("Guessed in " + iteration + " Guesses.");
    }
}