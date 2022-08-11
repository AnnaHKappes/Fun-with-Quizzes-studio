package main;

public class MultipleChoiceQuestion extends Question{

    public MultipleChoiceQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
//        answer = "A" or "B"
        String actualAnswer = this.getTheAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
