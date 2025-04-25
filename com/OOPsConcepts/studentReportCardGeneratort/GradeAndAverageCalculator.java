package com.OOPsConcepts.studentReportCardGeneratort;

public class GradeAndAverageCalculator {
    public double averageCalculation(double marks1, double marks2, double marks3){
        return (marks1 + marks2 + marks3)/3;
    }
    public String gradeCalculation(double average){
        String grade = "";
        if (average > 90)
            grade = "A";
        else if (average > 80)
            grade = "B";
        else if (average > 70)
            grade = "C";
        else if (average > 50)
            grade = "D";
        else if (average < 40)
            grade = "F";

        return grade;
    }

}
