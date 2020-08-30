/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 30/08/20
 *  Time: 19:05 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int ISSUED_NEW_BOOK = 1;
    public static final int PREVIOUS_ISSUED_BOOKS = 4;
    public static final int RETURNED_ISSUED_BOOKS = 6;
    public static final int EXIT = 8;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String firstName = scanner.nextLine();
        String middleName = scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Enter your University Roll No: ");
        long universityRollNo = scanner.nextLong();
        System.out.println("Enter no of books issued: ");
        int noOfBooksIssued = scanner.nextInt();
        Student student = new Student(firstName, middleName, lastName, universityRollNo, noOfBooksIssued);
        int studentReaction;
        Library library = new Library();

        do {
            System.out.println("_=_=__=_=_\"Welcome To The Front Desk\"_=_=__=_=_");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            studentReaction = scanner.nextInt();

            switch (studentReaction) {
                case ISSUED_NEW_BOOK: {
                    System.out.println("Save students details.");
                    System.out.println("Enter the name of the book you want to issue!");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    library.showIssuedBooks(bookName);
                }
                case RETURNED_ISSUED_BOOKS: {
                    System.out.println("Enter the no of the book you want to be return!");
                    scanner.nextInt();
                    String bookName = scanner.nextLine();
                    library.returnBook(bookName);
                }
                case PREVIOUS_ISSUED_BOOKS: {
                    System.out.println("your issued books are: ");
                    library.showIssuedBooks();

                }

            }
            while (studentReaction != EXIT) ;
            scanner.close();
        }
    }
