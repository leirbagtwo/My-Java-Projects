/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment7;

/**
 *
 * @author Gabriel
 */
public class GradedActivity2 {
    protected double score;  // Numeric score
    /**
        The setScore method sets the score field.
        @param s The value to store in score.
    */
    public void setScore(double s) {
        score = s;
    }
    /**
        The getScore method returns the score.
        @return The value stored in the score field.
    */
    public double getScore() {
        return score;
    }
    /**
        The getGrade method returns a letter grade
        determined from the score field.
        @return The letter grade.
    */
    public char getGrade() {
        char letterGrade;
        if (score >= 90)
        letterGrade = 'A';
        else if (score >= 80)
        letterGrade = 'B';
        else if (score >= 70)
        letterGrade = 'C';
        else if (score >= 60)
        letterGrade = 'D';
        else
        letterGrade = 'F';
        return letterGrade;
    }
}
