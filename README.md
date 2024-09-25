# Guess the Number Game

This is a simple **number guessing game** built using **Spring Boot** for the backend and **HTML, CSS, and JavaScript** for the frontend.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation and Setup](#installation-and-setup)
- [How to Play](#how-to-play)
- [Usage](#usage)
- [License](#license)

## Overview

The goal of the game is to guess a randomly generated number between **1 and 100**. You have **5 attempts** to guess the correct number. After each guess, you will receive feedback indicating whether the target number is higher or lower than your guess. If you use all 5 attempts without guessing correctly, the game will end and reveal the number.

## Features

- Randomly generated number between **1 and 100**.
- **5 attempts** to guess the number.
- Feedback on whether the target number is higher or lower than the guessed number.
- Option to **reset the game** and start over.

## Technologies Used

- **Backend**: Spring Boot (REST API)
- **Frontend**: HTML, CSS, JavaScript (Fetch API)
- **Tools**: Maven, Git

## Installation and Setup

Follow these steps to get the project running locally:

### Prerequisites

- Java 17+ installed on your machine
- Maven installed
- Git installed

### Steps

1. **Clone the repository**:

   ```bash
   git clone https://github.com/YOUR_USERNAME/guessing-game.git


2. **Navigate into the project directory:**

    ```bash
     cd guessing-game

3. **Build and run the Spring Boot application:**

 You can run the application using Maven: 

 ```bash
    mvn spring-boot:run
```
The application will start on http://localhost:8080.

4. **Access the game:**

Open a browser and go to: http://localhost:8080/index.html to play the game.

## How to Play
Enter a number between 1 and 100 into the input field.
Click Submit Guess.
The game will inform you if the guessed number is higher or lower than the target number.
You have 5 attempts to guess the correct number.
If you run out of attempts, the game will end and show the correct number.
Click Reset Game to start over.

## Usage
This project demonstrates the use of Spring Boot for a simple REST API and a basic frontend using HTML, CSS, and JavaScript.

Spring Boot handles the backend logic, including generating the random number and processing guesses.
Frontend is built with basic HTML for input, styled with CSS, and uses JavaScript to make asynchronous API requests.

**License**
This project is licensed under the MIT License - see the LICENSE file for details.


   
