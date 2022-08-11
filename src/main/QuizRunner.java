package main;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What's the sound dog make?\nA. Bark\nB. Quack\nC. Moo\nPlease just type a singer letter as an answer", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);
        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("What animal can fly?\nA. Bird\nB. Dog\nC.Chicken\nSelect all the apply", "A,C");
        myQuiz.addQuestion(myCheckBoxQuestion);
        TrueFalseQuestion myTrueFalseQuestion = new TrueFalseQuestion("Can duck fly?\nTrue\nFalse", "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();


    }
}
