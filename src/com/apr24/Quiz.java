package com.apr24;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create quiz questions
        Question[] questions = {
            new Question("What is the capital of France?",
                new String[]{"Berlin", "Paris", "Madrid", "Rome"}, 1),
            new Question("Which data type is used to create a variable that should store text?",
                new String[]{"String", "int", "char", "float"}, 0),
            new Question("Which keyword is used to inherit a class in Java?",
                new String[]{"this", "import", "extends", "implements"}, 2),
            new Question("Which method is the entry point of any Java program?",
                new String[]{"main()", "start()", "init()", "run()"}, 0),
            new Question("Which loop is guaranteed to execute at least once?",
                new String[]{"for", "while", "do-while", "if"}, 2)
        };

        int score = 0;

        System.out.println("=== Welcome to the Java Quiz ===");

        for (int i = 0; i < questions.length; i++) {
            questions[i].displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (questions[i].isCorrectAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! Correct answer: " + questions[i].getCorrectAnswer());
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        scanner.close();
    }
}
