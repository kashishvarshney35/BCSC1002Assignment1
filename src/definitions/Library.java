/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 29/08/20
 *  Time: 6:45 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] totalBook;

    public Library() {
        this.totalBook = new Book[10];
        for (int i = 0; i < totalBook.length; i++) {
            totalBook[i] = new Book("Book" + (i + 1));
        }
    }

    public Book[] getTotalBook() {
        return totalBook;
    }

    public void setTotalBook(Book[] totalBook) {
        this.totalBook = totalBook.clone();
    }

    /**
     * this method is used to return the issued book.
     *
     * @jeevan nameOfBook name of the book which is to be returned.
     */

    public void returnBook(String nameOfBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"" + nameOfBook + "\" is returned in the library database");
        System.out.println("Thanks!");
    }

    @Override
    public String toString() {
        return Arrays.toString(totalBook);
    }

    @Override
    public boolean equals(Object k) {
        if (this == k) return true;
        if (k == null || getClass() != k.getClass()) return false;
        Library library = (Library) k;
        return Arrays.equals(getTotalBook(), library.getTotalBook());
    }
}
