package oop;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;       // Random number to guess
    private int noOfGuesses;  // Number of guesses made

    // Constructor to generate random number
    public Game() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;  // Number between 1–100
        noOfGuesses = 0;
    }

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Method to take user input
    public int takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your guess (1–100): ");
        int guess = sc.nextInt();
        noOfGuesses++;
        return guess;
    }

    // Method to check whether the number is correct
    public boolean isCorrectNumber(int guess) {
        if (guess == number) {
            System.out.println("Correct! You guessed it in " + noOfGuesses + " tries.");
            return true;
        } else if (guess < number) {
            System.out.println("Too low! Try again.");
        } else {
            System.out.println("Too high! Try again.");
        }
        return false;
    }
}

// Main Game
public class Exercise3_43 {
    public static void main(String[] args) {
        Game game = new Game();
        boolean guessed = false;

        while (!guessed) {
            int userGuess = game.takeUserInput();
            guessed = game.isCorrectNumber(userGuess);
        }
    }
}

