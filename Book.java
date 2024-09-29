/*⦁	Create a class called Book to represent a book. 
 * A Book should include four pieces of information as instance
 *  variables‐a book name, an ISBN number, an author name and a publisher.
 *   Your class should have a constructor that initializes the four instance variables.
 *    Provide a set method and get method for each instance variable. 
 *    In addition, provide a method named getBookInfo that returns the
 *     description of the book as a String.
*/
package lab_projects;
public class Book {
    String bookName,isbnNumber,authorName,publisher;
    public Book(String bookName, String isbnNumber, String authorName, String publisher) {
        this.bookName = bookName;
        this.isbnNumber = isbnNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public String getBookName() {
        return bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book Name: " + bookName + "\nISBN Number: " + isbnNumber + "\nAuthor Name: " + authorName + "\nPublisher: " + publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "1234567890", "John Smith", "ABC Publisher");
        System.out.println(book.getBookInfo());
        
        book.setBookName("Advanced Java Programming");
        book.setIsbnNumber("9876543210");
        book.setAuthorName("Jane Doe");
        book.setPublisher("XYZ Publisher");
        
        System.out.println("\nUpdated Book Info:");
        System.out.println(book.getBookInfo());
    }
}