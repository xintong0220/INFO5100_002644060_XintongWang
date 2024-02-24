import java.util.ArrayList;
public abstract class Student {
    String name;
    ArrayList<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        this.quizScores = new ArrayList<>(15);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getQuizScores() {
        return quizScores;
    }

    public int calculateAverageQuizScore() {
        int sum = 0;
        for (Integer score : quizScores) {
            sum = sum + score;
        }
        return (int) (sum / quizScores.size());
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
    }
}
