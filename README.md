
# Guess the Number Game in Kotlin

## Overview

This repository contains a simple "Guess the Number" game implemented in Kotlin. The game generates a random number within a specified range, and the player tries to guess the number. The game provides feedback on whether the guess is too high, too low, or correct.

## Features

- Random number generation within a specified range.
- Player input for guessing the number.
- Feedback to the player indicating if their guess is too high, too low, or correct.
- Option to play again after a successful guess.

## Getting Started

### Prerequisites

- Kotlin 1.4 or later
- JDK 1.8 or later

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/Guess-Number-Game.git
    ```

2. Navigate to the project directory:

    ```bash
    cd Guess-Number-Game
    ```

### Running the Game

You can run the game from the command line or using an IDE like IntelliJ IDEA.

#### Command Line

1. Compile the Kotlin files:

    ```bash
    kotlinc src/main/kotlin/ -include-runtime -d GuessNumberGame.jar
    ```

2. Run the game:

    ```bash
    java -jar GuessNumberGame.jar
    ```

#### IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Navigate to the `Main.kt` file.
3. Click the "Run" button.

## How to Play

1. The game will prompt you to enter the maximum value for the random number generation.
2. Enter your guess when prompted.
3. The game will provide feedback if your guess is too high, too low, or correct.
4. If you guess the correct number, you will be asked if you want to play again.

## Example Output

```
Welcome to the Guess the Number Game!
Please enter the maximum value for the random number: 100
A random number has been generated between 1 and 100.
Enter your guess: 50
Your guess is too low.
Enter your guess: 75
Your guess is too high.
Enter your guess: 60
Congratulations! You guessed the number.
Do you want to play again? (yes/no): no
Thank you for playing!
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

[Your Name] - [mouadoumous@example.com](mailto:mouadoumous@gmail.com)

Feel free to reach out if you have any questions or suggestions!
