/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 29/08/20
 *  Time: 4:50 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String bookISBN;

    public Book() {
        this.bookName = getBookName();
        this.authorOfTheBook = getAuthorOfTheBook();
        this.bookISBN = getBookISBN();

    }

    public Book(String bookName) {
        this.bookName = bookName;
        this.authorOfTheBook = "unknown";
        this.bookISBN = "not declared";
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorOfTheBook() {
        return authorOfTheBook;
    }

    public void setAuthorOfTheBook(String authorOfTheBook) {
        this.authorOfTheBook = authorOfTheBook;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String tostring() {
        return "Book name is: " + getBookName() + "," + "author name is: " + getAuthorOfTheBook() + "," + "ISBN number is: " + getBookISBN() + ".";

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorOfTheBook(), book.getAuthorOfTheBook()) &&
                Objects.equals(getBookISBN(), book.getBookISBN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorOfTheBook(), getBookISBN());
    }

    /**
     * this method allows the student to issue the book.
     */

    public void issueBookName() {
        Scanner scanner = new Scanner(System.in);
        bookName = scanner.nextLine();
        System.out.println("\"" + bookName + "\" is now issued for you");
        System.out.println("Thanks!");
    }

    /**
     * this name is used to return the issued book.
     *
     * @jeevan nameOfBook name of the  book which is to be returned.
     */

    public void returnBook(String nameOfBook) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\"" + nameOfBook + "\" is returned in the library database");
        System.out.println("Thanks!");
    }


}
