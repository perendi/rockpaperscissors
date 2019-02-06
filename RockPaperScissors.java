/**
* Rock Paper Scissors game 
* @author Daniel Matyas Perendi
* First version 06/02/2019
*/
import sheffield.*;

public class RockPaperScissors{

private char c;
private static String userChoice;
public static void convertUserAnswer(char c) {
    switch (c) {
                case 'r' : case 'R' :
                    userChoice = "Rock";
                break;
                case 'p' : case 'P' :
                    userChoice = "Paper";
                break;
                case 's' : case 'S' :
                    userChoice = "Scissors";
                break;
                default: 
                    System.out.println("Not valid input!");
                break;
            }
}

    public static void main(String[] args){
        // Computers possible choices
        String[] Computer = {"Rock", "Paper", "Scissors"};
        // EasyReader for reading in user choices
        EasyReader keyboard = new EasyReader();
        // Whether the user wants to carry on playing
        boolean userPlay = true;
        // The games goes on until the user answers with yes to the "Do you want to play again?" question
        while (userPlay) {
            // Generate a random number from 0 to 2
            int randomNumber = (int)Math.round(Math.random()*2);
            // Prompt the user and reading the choice is
            char userAnswer = keyboard.readChar("Insert 'R' for Rock, 'P' for Paper and 'S' for Scissors: ");
            // Assigning values to the char inputs
            convertUserAnswer(userAnswer);
            if (userChoice != null) {
                // Printing out the choices first
                System.out.println();
                System.out.println("Computer's choice: "+Computer[randomNumber]);
                System.out.println("Your choice: "+userChoice);
                System.out.println();
                // Printing out the result depending on the previous two choices
                if (userChoice == Computer[randomNumber]) {
                    System.out.println("Your answer is equal to the Computers pick, try again!");
                }
                else if (userChoice == "Rock" && Computer[randomNumber] == "Scissors") {
                    System.out.println("Congratulations, you won!");
                }
                else if (userChoice == "Paper" && Computer[randomNumber] == "Rock"){
                    System.out.println("Congratulations, you won!");
                }
                else if (userChoice == "Scissors" && Computer[randomNumber] == "Paper"){
                    System.out.println("Congratulations, you won!");
                }
                else
                    System.out.println("You lost, the Computer won this time!");
            }
                userPlay = keyboard.readBoolean("Do you want to play again?(Y if yes, N if no) ");

        }
        System.out.println();
        System.out.println("Thank you for playing, Goodbye!");
    }
}