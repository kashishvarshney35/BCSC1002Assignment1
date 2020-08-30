/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 29/08/20
 *  Time: 2:30 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Objects;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNo;
    private int noOfBooksIssued;


    public Student() {
        this.fullName = getFullName();
        this.firstName = getFirstName();
        this.middleName = getMiddleName();
        this.lastName = getLastName();
        this.universityRollNo = getUniversityRollNo();
        this.noOfBooksIssued = getNoOfBooksIssued();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNo() {
        return universityRollNo;
    }

    public void setUniversityRollNo(long universityRollNo) {
        this.universityRollNo = universityRollNo;
    }

    public int getNoOfBooksIssued() {
        return noOfBooksIssued;
    }

    public void setNoOfBooksIssued(int noOfBooksIssued) {
        this.noOfBooksIssued = noOfBooksIssued;
    }

    @Override
    public boolean equals(Object k) {
        if (this == k) return true;
        if (k == null || getClass() != k.getClass()) return false;
        Student student = (Student) k;
        return getUniversityRollNo() == student.getUniversityRollNo() &&
                getNoOfBooksIssued() == student.getNoOfBooksIssued() &&
                Objects.equals(scanner, student.scanner) &&
                Objects.equals(getFullName(), student.getFullName()) &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName());


    }

    @Override
    public int hashCode() {
        return Object.hash(scanner, getFullName(), getFirstName(), getMiddleName(), getLastName(), getUniversityRollNo(), getNoOfBooksIssued());

    }

    /**
     * this method is used to take name as a input from the student.
     */

    public void studentDetails() {
        System.out.println("enter first name");
        firstName = scanner.nextLine();
        System.out.println("enter middle name");
        middleName = scanner.nextLine();
        System.out.println("enter last name");
        lastName = scanner.nextLine();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("full name is: " + fullName);
    }

    /**
     * this method is used to take university roll no as input from the student
     */

    public void enterUniversityRollNo() {
        System.out.println("Please enter your university roll no " + fullName);
        universityRollNo = scanner.nextLong();
    }
}



