/*  Created by IntelliJ IDEA.
 *  User: Kashish Varshney
 *  Date: 29/08/20
 *  Time: 2:30 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorOfTheBook;
    private String bookISBN;

    public Book() {
        this.bookName = getBookName();
        this.authorOfTheBook = getAuthorOfTheBook();
        this.bookISBN = getBookISBN();

    }

}
