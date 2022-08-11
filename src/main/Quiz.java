package main;

import java.util.ArrayList;
import java.util.Scanner;

//    Requirements:
//    Add questions
//    Run or carry out the quiz
//    Grade the quiz
public class Quiz {

//    Class variables
    private ArrayList<Question> questions = new ArrayList();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

//    Methods
    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz(){
//        Loop through each question
        for(Question question : questions) {
//        Ask the user the question
            System.out.println(question.getTheQuestion());
//        Get the users question
            String userAnswer = this.getUsersAnswers();
//        Check the answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer);
            if(userGotQuestionCorrect){
                this.numberOfQuestionsCorrect++;
            }
        }
//        Grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect /(double) this.questions.size()) * 100;
        System.out.println("User's Grade is: " + percentageCorrect + "%");
    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
