package libraryBookOOP;

import java.util.Arrays;

public class Client extends User {
    private String[] borrowedBooksCodes; //lista ISBNCode-urilor cartilor imprumutate de client

    private int numberOfBooksBorrowed;


    public Client(String name, String[] borrowedBooksCodes, int numberOfBooksBorrowed) {
        super(name);
        this.borrowedBooksCodes = borrowedBooksCodes;
        this.numberOfBooksBorrowed = numberOfBooksBorrowed;

    }

    public Client() {
    }

    public String[] getBorrowedBooksCodes() {
        return borrowedBooksCodes;
    }

    public void setBorrowedBooksCodes(String[] borrowedBooksCodes) {
        this.borrowedBooksCodes = borrowedBooksCodes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "borrowedBooksCodes=" + Arrays.toString(borrowedBooksCodes) +
                ", borrowedNumberOfBooks=" + numberOfBooksBorrowed +
                '}';
    }

    public void viewBorrowedBooksCodes() {
        for (int i = 0; i < numberOfBooksBorrowed; i++) {
            System.out.println("The books codes borrowed: " + borrowedBooksCodes[i]);
        }
    }


    public void borrowBook(String ISBNCode, Library library) throws BookNotAvailableException, BookNotFoundException {

        Book foundBook = library.searchBookByCode(ISBNCode);
        if ("".equals(foundBook.getISBNCode())) {
            throw new BookNotFoundException("The book that not exist");
        }
        if (foundBook.getNumberOfBorrowedCopies() == foundBook.getNumbersTotalOfCopies()) {
            throw new BookNotAvailableException("The book isn't availible");
        }
        this.borrowedBooksCodes[numberOfBooksBorrowed] = foundBook.getISBNCode();
        numberOfBooksBorrowed++;
        foundBook.setNumberOfBorrowedCopies(foundBook.getNumberOfBorrowedCopies() + 1);
    }


    public void returnBook(Library library, String ISBNCode) throws BookNotFoundToBeReturned {
        Book returnBook = library.searchBookByCode(ISBNCode);
        if (!ISBNCode.equals(returnBook.getISBNCode())) {
            throw new BookNotFoundToBeReturned("The book was returned");
        }
        int index = getCodeIndex(ISBNCode);
        for (int i = index; i < numberOfBooksBorrowed; i++) {
            borrowedBooksCodes[i] = borrowedBooksCodes[i + 1];
        }
        borrowedBooksCodes[numberOfBooksBorrowed] = null;
        numberOfBooksBorrowed--;
        returnBook.setNumberOfBorrowedCopies(returnBook.getNumberOfBorrowedCopies() - 1);
    }

    public int getCodeIndex(String ISBNCode) {
        for (int i = 0; i < borrowedBooksCodes.length; i++) {
            if (ISBNCode.equals(borrowedBooksCodes[i])) {
                return i;
            }
        }
        return -1;
    }


}






