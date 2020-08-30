/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 30/08/20
 *  Time: 7:05 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    public static final int NEW_BOOK = 1;
    public static final int ISSUED_BOOKS = 4;
    public static final int RETURNED_BOOKS = 6;
    public static final int EXIT = 8;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentReaction;
        String returnBook;
        Student student = new Student();
        Book book = new Book();
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
                case NEW_BOOK:
                    student.studentDetails();
                    student.enterUniversityRollNo();
                    System.out.println("Save students details.");
                    System.out.println("Enter the name of the book you want to issue!");
                    book.issueBookName();
                    book.detailsOfBook();
                    book.detailsOfIssuedBook();
                    book.messageForTheIssuedBook();
                    break;
                case RETURNED_BOOKS:
                    System.out.println("Enter the name of the book you want to be return!");
                    scanner.nextLine();
                    returnBook = scanner.nextLine();
                    library.returnBook(returnBook);
                    break;
                case ISSUED_BOOKS:
                    System.out.println("your issued books are: ");
                    library.showIssuedBooks();
                    break;
            }

        } while (studentReaction != EXIT);
        scanner.close();

    }
}
