package Quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Question q1 = new Question();
        q1.setText("What is the capital of Ireland?");
        q1.setAnswer("Dublin");

        q1.display();
        System.out.print("Your answer: ");
        String response = scan.nextLine();

        if(q1.checkAnswer(response))
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}
