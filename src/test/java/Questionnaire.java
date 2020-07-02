import questions.Astromy;

import java.util.Scanner;

public class Questionnaire {

    public static void main(String [] args) {
        runQuestions();
    }

    public static void runQuestions(){

        Scanner input = new Scanner(System.in);
        String insert = "";
        System.out.print("Enter 'astro' for Astronomy Question: " +
                "\nEnter 'nature' for Nature Orientated Question: " +
                "\nEnter 'bus' for Business Question: " +
                "\nEnter 'quit' to exit Questionnaire: ");

        while (!insert.equals("quit")){
            insert = input.next();
            switch (insert) {
                case "astro":
                    Astromy.runAstroQuestions();
                    break;
                case "nature":

                    break;
                case "bus":

                    break;
                case "quit":

                    break;
                default:
                    System.out.println("Invalid Entry Please Try Again...");

            }
        }
    }
}
