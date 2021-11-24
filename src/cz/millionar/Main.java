package cz.millionar;

import cz.millionar.questions.Question;
import cz.millionar.questions.QuestionImp;
import cz.millionar.utils.Utils;

public class Main {

    public static void main(String[] args) {
        Question question1 = new QuestionImp("Otazka?", "A", "B", "C", "D", 1);
        Question question2 = new QuestionImp("Otazka?", "A", "B", "C", "D", 2);
        Question question3 = new QuestionImp("Otazka?", "A", "B", "C", "D", 3);
        Question question4 = new QuestionImp("Otazka?", "A", "B", "C", "D", 4);
    }

}
