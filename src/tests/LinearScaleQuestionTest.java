package tests;

import main.LinearScaleQuestion;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinearScaleQuestionTest {
    LinearScaleQuestion linearScaleQuestion_test;

    @Before
    public void setUpTest(){
        linearScaleQuestion_test = new LinearScaleQuestion("A test question", 1, 10);
    }

    @Test
    public void constructorSetProperties(){
        assertEquals("A test question", linearScaleQuestion_test.getTheQuestion());
        assertEquals(1, linearScaleQuestion_test.getLowValue());
        assertEquals(10, linearScaleQuestion_test.getHighValue());
    }

    @Test
    public void checkAnswerReturnTrue(){
        boolean actualAnswer = linearScaleQuestion_test.checkAnswer("5");
        assertTrue(actualAnswer);
    }
}
