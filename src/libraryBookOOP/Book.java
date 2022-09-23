package libraryBookOOP;

public class Book{
    private String title;
    private String author;
    private String ISBNCode;
    private int numberOfBorrowedCopies;
    private int numbersTotalOfCopies;

    public Book(String title, String author, String ISBNCode, int numberOfBorrowedCopies, int numbersTotalOfCopies) {
        this.title = title;
        this.author = author;
        this.ISBNCode = ISBNCode;
        this.numberOfBorrowedCopies = numberOfBorrowedCopies;
        this.numbersTotalOfCopies = numbersTotalOfCopies;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public String getISBNCode() {
        return ISBNCode;
    }

    public void setISBNCode(String ISBNCode) {
        this.ISBNCode = ISBNCode;
    }

    public int getNumberOfBorrowedCopies() {
        return numberOfBorrowedCopies;
    }

    public void setNumberOfBorrowedCopies(int numberOfBorrowedCopies) {
        this.numberOfBorrowedCopies = numberOfBorrowedCopies;
    }

    public int getNumbersTotalOfCopies() {
        return numbersTotalOfCopies;
    }

    public void setNumbersTotalOfCopies(int numbersTotalOfCopies) {
        this.numbersTotalOfCopies = numbersTotalOfCopies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBNCode='" + ISBNCode + '\'' +
                ", numberOfBorrowedCopies=" + numberOfBorrowedCopies +
                ", numbersTotalOfCopies=" + numbersTotalOfCopies +
                '}';
    }
}