package org.ikiseh;
import java.util.Scanner;
import java.util.Random;


public class MyJavaApp {

    // Method to greet the user
    public static void greetUser(String userName) {
        String welcomeMessage = "Hello, " + userName + "! Welcome to the math quiz.";
        System.out.println(welcomeMessage);
    }

    // Method to choose the operator based on the random choice integer generated
    public static String chooseOperator(int opNum){
        if (opNum == 1){
            return " - ";
        }
        else if(opNum == 2){
            return " - ";
        }
        else if(opNum == 3){
            return " * ";
        }
        else{
            return " / ";
        }
    }

    // Method to perform the required operation and calculate the correct answer
    public static int calculateAnswer(int n1, int n2, String op) {
        int result = 0;
        if(op == " - "){

            return n1 - n2;
        }
        else if(op == " + "){

            return n1 + n2;
        }
        else if(op == " * "){

            return n1 * n2;
        }
        else if(op == " / "){

            return (int)(n1 / n2);
        }
        else{
            return -1;

        }

    }

    // Method to print the question in the correct format
    public static void printQuestion(int num1, int num2, String op) {
        String question = "What is " + num1 + op + num2 + "?";
        System.out.println(question);
    }

    // Method to bid farewell to the user and give them the result
    public static void printResult(String userName, int score){
        String farewellMessage = "Thanks for taking the quiz. " + userName + ". Your score is " + score + " out of 5.";
        System.out.println(farewellMessage);
    }

    // MAIN STRUCTURE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int num1 = 0;
        int num2 = 0;
        int opNum = 0;
        String op = "";
        int userAnswer = 0;
        int correctAnswer = 0;
        int score = 0;
        int totalQuestions = 0;

        // Take input from user and save it in a variable
        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();

        // Make a customized greeting for the user and print it
        greetUser(userName);

        while (totalQuestions < 5){

            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
            opNum = random.nextInt(4) + 1;
            op = chooseOperator(opNum);
            printQuestion(num1,num2,op);
            System.out.print("Ans: ");
            userAnswer = scan.nextInt();
            correctAnswer = calculateAnswer(num1, num2, op);
            // Increase the score if the answer is correct.
            if (userAnswer == correctAnswer){
                System.out.println("Correct answer.");
                score = score + 1;
            }
            else{
                System.out.println("Oops, that's not right. The correct answer is: " + correctAnswer);
            }
            totalQuestions = totalQuestions + 1;
        }

        // Call the printResult method here.
        printResult(userName,score);

    }
}