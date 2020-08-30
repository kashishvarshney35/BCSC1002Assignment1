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
        int studentResponse;
        String returnBook;
        Student student = new Student();
        Book book = new Book();
        Library library = new Library();

        do {
            System.out.println("_=_=__=_=_\"Welcome To The Front Desk\"_=_=__=_=_");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
        }

    }
}
