import java.util.Random;
import java.util.Scanner;
public class number_guessing
{
    static int number;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        System.out.println("Please select the difficulty level:");
        System.out.println("1. Easy (10 chances)\n" +
                "2. Medium (5 chances)\n" +
                "3. Hard (3 chances)");
        System.out.print("Enter your choice:");
        int a =sc.nextInt();
        int count=0;
        int attempts=0;
        boolean success=false;
        number=random.nextInt(0,10);
        switch (a)
        {
            case 1 -> {
                System.out.println("Great! You have selected the Easy difficulty level.");
                System.out.println("Let's start the game!");
                count=10;
                while(count>0)
                {
                    System.out.print("Enter your guess:");
                    attempts++;
                    int guess=sc.nextInt();
                    if(check(guess)==true)
                    {
                        System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
                        success=true;
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong guess try again");
                        count--;
                    }
                }
                if(success==false)
                {
                    System.out.println("You ran out of attempts");
                    System.out.println("The number was "+number);
                }
            }
            case 2 -> {
                System.out.println("Great! You have selected the Medium difficulty level.");
                System.out.println("Let's start the game!");
                count=5;
                while(count>0)
                {
                    System.out.print("Enter your guess:");
                    attempts++;
                    int guess=sc.nextInt();
                    if(check(guess)==true)
                    {
                        System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
                        success=true;
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong guess try again");
                        count--;
                    }
                }
                if(success==false)
                {
                    System.out.println("You ran out of attempts");
                    System.out.println("The number was "+number);
                }
            }
            case 3 -> {
                System.out.println("Great! You have selected the Hard difficulty level.");
                System.out.println("Let's start the game!");
                count=3;
                while(count>0)
                {
                    System.out.print("Enter your guess:");
                    attempts++;
                    int guess=sc.nextInt();
                    if(check(guess)==true)
                    {
                        System.out.println("Congratulations! You guessed the correct number in "+attempts+" attempts.");
                        success=true;
                        break;
                    }
                    else
                    {
                        System.out.println("Wrong guess try again");
                        count--;
                    }
                }
                if(success==false)
                {
                    System.out.println("You ran out of attempts");
                    System.out.println("The number was "+number);
                }
            }
            default -> System.out.println("Choose a Valid number");
        }
    }
    public static boolean check(int b)
    {
        if(b==number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
