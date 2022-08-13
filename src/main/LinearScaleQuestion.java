package main;

public class LinearScaleQuestion extends Question{

    private int lowValue;
    private int highValue;

    public LinearScaleQuestion(String theQuestion, int lowValue, int highValue) {
        super(theQuestion, null);
        this.lowValue = lowValue;
        this.highValue = highValue;
    }

    @Override
    public boolean checkAnswer(String answer) {
        int answerInInt = Integer.parseInt(answer);
        if(answerInInt >= lowValue && answerInInt <= highValue){
            return true;
        } else {
            return false;
        }
    }

    public int getLowValue() {
        return lowValue;
    }

    public int getHighValue() {
        return highValue;
    }
}