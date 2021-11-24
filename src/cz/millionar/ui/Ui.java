package cz.millionar.ui;

import cz.millionar.questions.Question;
import cz.millionar.questions.QuestionImp;
import cz.millionar.utils.Utils;

public class Ui {

    public void print(QuestionImp question) {
        System.out.println(question.getQuestionText());
        System.out.println(" (1) - " + question.getAnswer1());
        System.out.println(" (2) - " + question.getAnswer2());
        System.out.println(" (3) - " + question.getAnswer3());
        System.out.println(" (4) - " + question.getAnswer4());
        System.out.print(Utils.scannerText);
        int guess = Utils.scan();
        if (guess != question.getRightAnswer()) { question.wrong(); }
        else { question.right(); }
    }

    public void wrong(QuestionImp question) {
        System.out.println("\nWrong answer! Right answer was (" + question.getRightAnswer() + ")");
    }

    public void right() {
        System.out.println("\nCorrect!\n");
    }

}
