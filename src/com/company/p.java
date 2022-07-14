/*
 NAME: EZE HENRY CHIDERA
 REG N0 2019/244892
*//*
 NAME: EZE HENRY CHIDERA
 REG N0 2019/244892
*/

import java.util.Scanner;

public class p {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of courses :");

        int courses = input.nextInt();

        int[][] result = new int[courses][2];

        for (int i = 0; i < courses; i++) {
            System.out.println("Inputs for course " + (i + 1) + ":");
            System.out.print("\tCA score? ");
            int ca = input.nextInt();
            System.out.print("\tExam score? ");
            int exam = input.nextInt();

            result[i][0] = ca;
            result[i][1] = exam;
        }
        System.out.println("Showing calculated Final Score and Grade: ");
        int k = 0;
        while (k < result.length) {
            int totalScore = result[k][0] + result[k][1];
            String courseGrade = null;
            if (totalScore >= 70) courseGrade = "A";
            else if (totalScore >= 60 && totalScore < 70) courseGrade = "B";
            else courseGrade = "F";
            System.out.printf("Course %d: Total Score = %d, Course Grade = %s\n", k, totalScore, courseGrade);
            k++;
        }
    }
}

