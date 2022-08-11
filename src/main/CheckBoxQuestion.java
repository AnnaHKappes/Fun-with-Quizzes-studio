package main;

public class CheckBoxQuestion extends Question{

    public CheckBoxQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
//        answer = "A, B, C"
        String actualAnswer = this.getTheAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
