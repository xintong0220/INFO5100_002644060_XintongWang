public class FullTimeStudent extends Student {
    int examScore1;
    int examScore2;

    public FullTimeStudent(String name, int examScore1, int examScore2) {
        super(name);
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
    }

    public void printExamScore() {
        System.out.println(name + "'s exam scores : " + examScore1 + " , " + examScore2);
    }
}
