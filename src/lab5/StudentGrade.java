/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This file is an example of file that can read to another file.
 * @author Vincent Benesen &lt;vincebry0803@yahoo.com&gt;
 */
public class StudentGrade {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/vincentbenesen/NetbeansProjects/FileClass/Studentscore.txt");
        Scanner scFile = new Scanner(file);

        String studentData = scFile.next() + scFile.nextLine();
        int dot = studentData.indexOf(".");
        String studentName = studentData.substring(0, dot).trim();
        String grades = studentData.substring(dot + 1).trim();
        double studentGrade = Integer.parseInt(grades);

        int totalAmountOfGrades = 1;
        double averageScore = 0;
        double totalScore = studentGrade;
        double highestScore = studentGrade;
        double lowestScore = studentGrade;
        String smartest = studentName;
        String dumbbest = studentName;

        while (scFile.hasNext()) {

            studentData = scFile.next() + scFile.nextLine();
            dot = studentData.indexOf(".");
            studentName = studentData.substring(0, dot);
            grades = studentData.substring(dot + 1).trim();
            studentGrade = Integer.parseInt(grades);

            totalScore += studentGrade;
            totalAmountOfGrades++;

            if (studentGrade > highestScore) {
                highestScore = studentGrade;
                smartest = studentName;
            } else if (studentGrade < highestScore && lowestScore > studentGrade) {
                lowestScore = studentGrade;
                dumbbest = studentName;
            }
        }
        System.out.println("The student who has the highest grade is " + smartest);
        System.out.println("The student who has the lowest grade is " + dumbbest);
        System.out.println("The total amount of grades that has been processed are "
                + totalAmountOfGrades);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        System.out.println("The average of the class is "
                + twoDecimals.format(totalScore / totalAmountOfGrades));
    }
}