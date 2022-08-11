package main;

public class TrueFalseQuestion extends Question{
    public TrueFalseQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkAnswer(String answer) {
//        answer = "true" "false"
        if(answer.toLowerCase().equals(this.getTheAnswer().toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
