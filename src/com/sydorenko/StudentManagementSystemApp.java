package com.sydorenko;

import java.util.Scanner;

public class StudentManagementSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].viewBalance();
            students[i].payTuition();
        }
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].toString() + "\n");
        }
    }
}
