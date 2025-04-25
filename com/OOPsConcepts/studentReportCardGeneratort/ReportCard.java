package com.OOPsConcepts.studentReportCardGeneratort;

import java.util.Scanner;

public class ReportCard {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Student obj = new Student();
        System.out.println("Enter Name");
        obj.setName(scanner.next());
        System.out.println("Enter Roll");
        obj.setRollNumber(scanner.nextInt());
        System.out.println("Enter Physics marks");
        obj.setPhysicsMarks(scanner.nextInt());
        System.out.println("Enter Chemistry marks");
        obj.setChemistryMarks(scanner.nextInt());
        System.out.println("Enter Biology marks");
        obj.setBiologyMarks(scanner.nextInt());


        GradeAndAverageCalculator obj1 = new GradeAndAverageCalculator();
        double average = obj1.averageCalculation(obj.getBiologyMarks(), obj.getChemistryMarks(), obj.getPhysicsMarks());
        String grade = obj1.gradeCalculation(average);

        System.out.println("NAME OF THE STUDENT :"+obj.getName());
        System.out.println("Roll Number OF THE STUDENT :"+obj.getRollNumber());
        System.out.println("Physics Marks OF THE STUDENT :"+obj.getPhysicsMarks());
        System.out.println("Chemistry Marks OF THE STUDENT :"+obj.getChemistryMarks());
        System.out.println("Biology Marks OF THE STUDENT :"+obj.getBiologyMarks());
        System.out.println("The average of the marks is: "+average);
        System.out.println("Grade achieved isL: "+grade);

    }
}
