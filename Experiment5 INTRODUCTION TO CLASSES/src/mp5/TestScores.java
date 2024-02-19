package mp5;
/**
 * @author Gabriel
 */
public class TestScores {
    private double score1;
    private double score2;
    private double score3;

    public TestScores(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public void setScore1(double score) {
        score1 = score;
    }

    public void setScore2(double score) {
        score2 = score;
    }

    public void setScore3(double score) {
        score3 = score;
    }

    public double getScore1() {
        return score1;
    }

    public double getScore2() {
        return score2;
    }

    public double getScore3() {
        return score3;
    }

    public double getAverageScore() {
        return (score1 + score2 + score3) / 3;
    }
}
