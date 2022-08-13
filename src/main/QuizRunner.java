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

        ShortAnswerQuestion myShortAnswerQuestion = new ShortAnswerQuestion("Pandas are from which country?", "China");
        myQuiz.addQuestion(myShortAnswerQuestion);

        LinearScaleQuestion myLinearScaleQuestion = new LinearScaleQuestion("On a scale from 1-10 how cute are Pandas?", 8, 10);
        myQuiz.addQuestion(myLinearScaleQuestion);

        ParagraphQuestion myParagraphQuestion = new ParagraphQuestion("Tell me why animals are cool?", "Because they are.");
        myQuiz.addQuestion(myParagraphQuestion);

        myQuiz.runQuiz();
    }
}