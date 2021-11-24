package cz.millionar.questions;

public interface Question {

    String questionText();
    String answer1();
    String answer2();
    String answer3();
    String answer4();
    int rightAnswer();
    void startQuestion();

}
