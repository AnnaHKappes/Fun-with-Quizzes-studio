package tests;

import main.CheckBoxQuestion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckBoxQuestionTest {
    CheckBoxQuestion checkBoxQuestion_test;

    @Before
    public void setUpTest(){
        checkBoxQuestion_test = new CheckBoxQuestion("A test question", "A test answer");
    }

    @Test
    public void constructorSetProperties(){
        assertEquals("A test question", checkBoxQuestion_test.getTheQuestion());
        assertEquals("A test answer", checkBoxQuestion_test.getTheAnswer());
    }

    @Test
    public void checkAnswerReturnTrue(){
        boolean actualAnswer = checkBoxQuestion_test.checkAnswer("A test answer");
        assertTrue(actualAnswer);
    }
}