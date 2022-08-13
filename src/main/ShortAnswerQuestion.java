package main;

public class ShortAnswerQuestion extends Question{
    public ShortAnswerQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if(answer.length() > 80){
            System.out.println("Answer was greater than 80 characters");
            return false;
        }
        String actualAnswer = this.getTheAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
