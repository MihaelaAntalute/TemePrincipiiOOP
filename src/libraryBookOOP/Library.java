package libraryBookOOP;

import java.util.Arrays;

public class Library  {
    private Book[] bookList = new Book[3000];

    private User[] userList = new User[100];
    private int numberOfBooks;

    private int numberOfUsers;


    public Library(Book[] bookList,int numberOfBooks,int numberOfUsers) {
        this.bookList = bookList;
        this.numberOfBooks = numberOfBooks;
        this.numberOfUsers = numberOfUsers;

    }

    public Library(User[] userList){
        this.userList = userList;
    }

    public Library() {
    }

    public User[] getUserList() {
        return userList;
    }

    public void setUserList(User[] userList) {
        this.userList = userList;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + Arrays.toString(bookList) +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }

    public Book searchBookByCode(String ISBNCode) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (ISBNCode.equals(bookList[i].getISBNCode())) {
                return bookList[i];
            }
        }
        return new Book("", "", "", 0, 0);

    }

    public Book searchBookByTitle(String title) {
        for (int i = 0; i < bookList.length; i++) {
            if (title.equals(bookList[i].getTitle())) {
                return bookList[i];
            }
        }
        return new Book("", "", "", 0, 0);
    }

    public Book searchBookByAuthor(String author){
        for (int i = 0; i < bookList.length ; i++) {
            if(author.equals(bookList[i].getAuthor())){
                return bookList[i];
            }
        }
        return new Book("","","",0,0);
    }

    public void listBookDetails(Library library, String ISBNCode) {
        Book detailBook = library.searchBookByCode(ISBNCode);
        System.out.println(detailBook.toString());
    }
    public void listAllBooks(Library library) {
        for (int i = 0; i < library.getNumberOfBooks(); i++) {
            System.out.println(library.getBookList()[i].toString());
        }
    }


}