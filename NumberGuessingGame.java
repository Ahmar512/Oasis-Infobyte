import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int computerNumber = rand.nextInt(100)+1;
        int userNumber = -1;
        int count=1;
        while(userNumber != computerNumber){
            String temp = JOptionPane.showInputDialog(null, "Enter a guess","Guessing Game", 3);
            userNumber = Integer.parseInt(temp);
            JOptionPane.showMessageDialog(null, ""+determineGuess(userNumber, computerNumber, count));
            count++;
        }
    }
    public static String determineGuess(int userNumber , int computerNumber, int count){
        double a = 100/Math.pow(count, 0.15);
        int c = (int)a;
        if(userNumber < 0 || userNumber > 100){
            return "Your guess is invalid.";
        }else if(userNumber == computerNumber){
            return "Correct! You win. \nTotal Guesses: "+count+"\nYour Points: "+c;
        }else if(userNumber > computerNumber){
            return "Number is lower. \nNumber of Guess: "+count;
        }else {
            return "Number is higher. \nNumber of Guess: "+count;
        }
    }
}

