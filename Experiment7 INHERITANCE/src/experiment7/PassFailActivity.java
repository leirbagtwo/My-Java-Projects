/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment7;
/**
    This class holds a numeric score and determines
    whether the score is passing or failing.
*/
public class PassFailActivity extends GradedActivity {
    private final double minPassingScore; // Minimum passing score
    /**
        The constructor sets the minimum passing score.
        @param mps The minimum passing score.
    */
    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }
    /**
        The getGrade method returns a letter grade
        determined from the score field. This
        method overrides the superclass method.
        @return The letter grade.
    */
    @Override
    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassingScore) {
            letterGrade = 'P';
        } else {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
