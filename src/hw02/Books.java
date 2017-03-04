/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

/**
 * This Class is content of books.
 * @author ercan
 */
public class Books {
    
    private String book_name;
    private String book_author;
    private String book_type;
    private int bookID;
    
    /**
     * 4 parameters constructor.
     * @param book_name The name of book.
     * @param book_author The author of book.
     * @param book_type The type of book.
     * @param bookID The ID of book.
     */
    public Books(String book_name, String book_author, String book_type, int bookID) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_type = book_type;
        this.bookID = bookID;
    }
    /**
     * Getter book name.
     * @return name of book.
     */
    public String getBook_name() {
        return book_name;
    }
    /**
     * Setter book name.
     * @param book_name set new book name. 
     */
    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }
    /**
     * Getter book author.
     * @return author of book.
     */
    public String getBook_author() {
        return book_author;
    }
    /**
     * Setter book author.
     * @param book_author set new book author.
     */
    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }
    /**
     * Getter book type.
     * @return type of book.
     */
    public String getBook_type() {
        return book_type;
    }
    /**
     * Setter book type
     * @param book_type set new book type.
     */
    public void setBook_type(String book_type) {
        this.book_type = book_type;
    }
    /**
     * Getter book ID.
     * @return ID of book.
     */
    public int getBookID() {
        return bookID;
    }
    /**
     * Setter book ID.
     * @param bookID set new book ID.
     */
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    @Override
    public String toString() {
        return "\n\t\tBooks{" + "book_name=" + book_name +
               ", book_author=" + book_author +
               ", book_type=" + book_type +
               ", bookID=" + bookID + "}\n";
    }
    
    
    
}
