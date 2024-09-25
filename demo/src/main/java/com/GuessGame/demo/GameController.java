package com.GuessGame.demo ;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class GameController {

    private Random random = new Random();
    private int randomNumber = 1 + random.nextInt(100);
    private int attemptsLeft = 5;

    @GetMapping("/guess/{number}")
    public String guessNumber(@PathVariable int number) {
        if (attemptsLeft > 0) {
            if (number == randomNumber) {
                return "Congratulations! You guessed the correct number.";
            } else if (number < randomNumber) {
                attemptsLeft--;
                return "The number is higher than " + number + ". Attempts left: " + attemptsLeft;
            } else {
                attemptsLeft--;
                return "The number is lower than " + number + ". Attempts left: " + attemptsLeft;
            }
        } else {
            return "Sorry! You've used all your attempts. The number was " + randomNumber + ". Press reset to play again.";
        }
    }

    @GetMapping("/reset")
    public String resetGame() {
        randomNumber = 1 + random.nextInt(100);
        attemptsLeft = 5;
        return "Game has been reset. Try to guess the new number!";
    }
}
