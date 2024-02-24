import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Session session = new Session();
        Random random = new Random();

        // for example, add 10 part-time students
        for (int i = 0; i < 10; i++) {
            PartTimeStudent partTimeStudent = new PartTimeStudent("part-time student" + (i + 1));
            for (int j = 0; j < 15; j++) {
                partTimeStudent.addQuizScore(random.nextInt(100));
            }
            session.addStudent(partTimeStudent);
        }

        // also add 10 full-time students
        for (int i = 0; i < 10; i++) {
            FullTimeStudent fullTimeStudent = new FullTimeStudent("full-time student" + (i + 1), random.nextInt(100), random.nextInt(100));
            for (int j = 0; j < 15; j++) {
                fullTimeStudent.addQuizScore(random.nextInt(100));
            }
            session.addStudent(fullTimeStudent);
        }

        session.printPartTimeStudentsName();
        session.printAverageQuizScore();
        session.printQuizScoreInAscendingOrder();
        session.printFullTimeStudentsExamScores();
    }
}