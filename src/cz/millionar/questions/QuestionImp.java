package cz.millionar.questions;

import cz.millionar.ui.Ui;

public class QuestionImp implements Question {

    Ui thisUi;

    public QuestionImp(Ui thisUi) {
        this.thisUi = thisUi;
    }

    String questionText;
    String answer1;
    String answer2;
    String answer3;
    String answer4;
    int rightAnswer;
    boolean win;

    public QuestionImp(String questionText, String answer1, String answer2, String answer3, String answer4, int rightAnswer) {
        this(new Ui());
        this.questionText = questionText;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public boolean isWin() {
        return win;
    }

    @Override
    public void start() {
        thisUi.print(this);
    }

    @Override
    public void wrong() {
        thisUi.wrong(this);
        win = false;
    }

    @Override
    public void right() {
        thisUi.right();
        win = true;
    }
}
