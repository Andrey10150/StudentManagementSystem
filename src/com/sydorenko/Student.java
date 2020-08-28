package com.sydorenko;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = "";
    private int tuitionBalance;
    private String studentId;
    private int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1 Freshman\n2 Sophomore\n3 Junior\n4 Senior\n Enter student class level: ");
        this.gradeYear = scanner.nextInt();
        setStudentId();

    }

    private void setStudentId() {
        id++;
        studentId = Integer.toString(gradeYear) + id;
    }

    public void enroll() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a course to enroll ( press 'Q' to quit ): ");
            String course = scanner.nextLine().toLowerCase();
            if (!course.equals("q") && !course.equals("")) {
                courses = courses + "\n " + course;
                tuitionBalance += costOfCourse;
                System.out.println("ENROLLED IN " + course);
                System.out.println("TUITION BALANCE IS " + tuitionBalance + "$");
            } else {
                break;
            }
        }
    }

    public void viewBalance() {
        System.out.println("Your tuition balance is " + tuitionBalance + "$" + " now");
    }

    public void payTuition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how much do you want to pay: ");
        int payment = scanner.nextInt();
        if (payment > 0) {
            tuitionBalance -= payment;
            System.out.println("Thanks for your payment " + payment + "$");
            viewBalance();
        }
    }

    @Override
    public String toString() {
        return ("Name is " + firstName + " " + lastName
                + "\nStudent id is " + studentId + "\nGrade level: " + gradeYear
                + "\nCourses enrolled: " + courses + "\nTuition balance: " + tuitionBalance + "$");
    }
}
