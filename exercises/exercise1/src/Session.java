import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Session {
    ArrayList<Student> students;

    public Session() {
        students = new ArrayList<>(20);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printAverageQuizScore() {
        System.out.println("Calculate average quiz scores per student:");
        for (Student student : students) {
            System.out.println(student.getName() + "'s average quiz score : " + student.calculateAverageQuizScore());
        }
        System.out.println();
    }

    public void printQuizScoreInAscendingOrder() {
        System.out.println("Print the list of quiz scores in ascending order:");
        for (Student student : students) {
            ArrayList<Integer> quizScores = student.getQuizScores();
            Collections.sort(quizScores);
            System.out.println(student.getName() + "'s quiz score in ascending order : " + quizScores);
        }
        System.out.println();
    }

    public void printPartTimeStudentsName() {
        System.out.println("Print names of part-time students:");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.println(student.getName());
            }
        }
        System.out.println();
    }

    public void printFullTimeStudentsExamScores() {
        System.out.println("Print exam scores of full-time students:");
        for (Student student : students) {
            if (student instanceof FullTimeStudent) {
                ((FullTimeStudent) student).printExamScore();
            }
        }
    }
}
