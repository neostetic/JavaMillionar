package cz.millionar.ui;

import cz.millionar.questions.Question;
import cz.millionar.questions.QuestionImp;

public class Ui {

    QuestionImp question;

    public Ui(QuestionImp question) {
        this.question = question;
    }

    public void print() {
        System.out.println(question.getQuestionText());
        System.out.println(" (1) - " + question.getAnswer1());
        System.out.println(" (2) - " + question.getAnswer2());
        System.out.println(" (3) - " + question.getAnswer3());
        System.out.println(" (4) - " + question.getAnswer4());
    }

    public void wrong() {
        System.out.println("\nWrong answer! Right answer was (" + question.getRightAnswer() + ")");
    }

    public void right() {

        System.out.println("\nCorrect!");
    }

}
