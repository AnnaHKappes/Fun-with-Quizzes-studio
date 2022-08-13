package main;

public class ParagraphQuestion extends Question{
    public ParagraphQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        if(answer.length() > 500){
            System.out.println("Answer was greater than 500 characters");
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
