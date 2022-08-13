package tests;

import main.CheckBoxQuestion;
import main.Quiz;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QuizTest {
    Quiz quiz_test;

    @Before
    public void setUpTest(){
        quiz_test = new Quiz();
    }

    @Test
    public void addQuestionMethodAddQuestion(){
        CheckBoxQuestion testQuestion = new CheckBoxQuestion("A test question", "A test answer");
        quiz_test.addQuestion(testQuestion);
        assertEquals(1, quiz_test.getQuestions().size());
    }
}
