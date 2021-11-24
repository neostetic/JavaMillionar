package cz.millionar;

import cz.millionar.questions.Question;
import cz.millionar.questions.QuestionImp;
import cz.millionar.utils.Utils;

public class Main {

    public static void main(String[] args) {
        questions();
    }

    private static void questions() {
        Question randomQuestion;
        do {
            Question[] questions = {
                    new QuestionImp("Otazka1?", "A", "B", "C", "D", 1),
                    new QuestionImp("Otazka2?", "A", "B", "C", "D", 2),
                    new QuestionImp("Otazka3?", "A", "B", "C", "D", 3),
                    new QuestionImp("Otazka4?", "A", "B", "C", "D", 4)
            };
            randomQuestion = questions[Utils.random(questions.length)];
            randomQuestion.start();
        } while (randomQuestion.isWin());
    }

}
