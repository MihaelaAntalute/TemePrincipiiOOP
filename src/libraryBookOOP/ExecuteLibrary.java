package libraryBookOOP;

import java.util.Scanner;

public class ExecuteLibrary {
    public static void main(String[] args) {
        User[] userList = new User[100];
        Admin admin = new Admin();
        Client client = new Client();
        userList[0] = admin;
        Library library = new Library(userList);
        Scanner console = new Scanner(System.in);
        int option;
        System.out.println("Insert 1 if you are admin and 2 if you are client");
        int userOption = Integer.parseInt(console.nextLine());
        if (userOption == 1) {
            do {
                printMenuAdmin();
                option = Integer.parseInt(console.nextLine());
                doAdministratorAction(option, console, library, admin);
            }
            while (option != 13);
        } else {
            do {
                printMenuClient();
                option = Integer.parseInt(console.nextLine());
                doClientActions(option, console, library, client);
            }
            while (option != 10);
        }

    }


    public static void printMenuAdmin() {
        System.out.println("Administrator menu: ");
        System.out.println("1.Add book to library");
        System.out.println("2.Search book by ISBNCode");
        System.out.println("3.Search book by title");
        System.out.println("4.Search book by author");
        System.out.println("5.Delete book from library");
        System.out.println("6.Delete copy book");
        System.out.println("7.List all books from library");
        System.out.println("8.List book details from library by ISBNCode");
        System.out.println("9.Add client to user list");
        System.out.println("10.Print user list");
        System.out.println("11.View borrowed books list from user");
        System.out.println("12.Delete user");
        System.out.println("13.Exit");

    }

    public static void printMenuClient() {
        System.out.println("Client menu: ");
        System.out.println("1.Search book by ISBNCode");
        System.out.println("2.Search book by title");
        System.out.println("3.Search book by author");
        System.out.println("4.List all books from library");
        System.out.println("5.List book details from library by ISBNCode");
        System.out.println("6.View borrowed books codes");
        System.out.println("7.Borrow book");
        System.out.println("8.Return book");
        System.out.println("9.Print borrowed books");
        System.out.println("10.Exit");
    }

    public static void doAdministratorAction(int option, Scanner console, Library library, Admin admin) {
        switch (option) {
            case 1:
                System.out.println("Add book to library");
                System.out.println("Insert book title:");
                String title = console.nextLine();
                System.out.println("Insert author:");
                String author = console.nextLine();
                System.out.println("Insert ISBNCode:");
                String ISBNCode = console.nextLine();
                System.out.println("Insert number of borrowed copies");
                int numberOfBorrowedCopies = Integer.parseInt(console.nextLine());
                System.out.println("Insert number total of copies");
                int numbersTotalOfCopies = Integer.parseInt(console.nextLine());
                Book book = new Book(title, author, ISBNCode, numberOfBorrowedCopies, numbersTotalOfCopies);
                admin.addBook(library, book);
                break;
            case 2:
                System.out.println("Search book by ISBNCode");
                System.out.println("Insert ISBNCode: ");
                String ISBNCode1 = console.nextLine();
                library.searchBookByCode(ISBNCode1);
                break;
            case 3:
                System.out.println("Search book by title");
                System.out.println("Insert title: ");
                String title1 = console.nextLine();
                library.searchBookByTitle(title1);
                break;
            case 4:
                System.out.println("Search book by author");
                System.out.println("Insert author: ");
                String author1 = console.nextLine();
                library.searchBookByAuthor(author1);
                break;
            case 5:
                System.out.println("Delete book from library");
                System.out.println("Insert ISBNCode: ");
                String ISBNCode2 = console.nextLine();
                admin.deleteBook(library, ISBNCode2);
                break;
            case 6:
                System.out.println("Delete copy book");
                System.out.println("Insert ISBNCode:");
                String ISBNCode3 = console.nextLine();
                System.out.println("Insert number of copies:");
                int numberOFCopies = Integer.parseInt(console.nextLine());
                admin.deleteBook(library, ISBNCode3, numberOFCopies);
                break;
            case 7:
                System.out.println("List all books from library");
                library.listAllBooks(library);
                break;
            case 8:
                System.out.println("List book details from library by ISBNCode");
                System.out.println("Insert ISBNCode:");
                String ISBNCode4 = console.nextLine();
                library.listBookDetails(library, ISBNCode4);
                break;
            case 9:
                System.out.println("Add client tot user list");
                System.out.println("Insert name:");
                String userName = console.nextLine();
                String[] borrowedBookCodes = new String[10];
                Client client = new Client(userName, borrowedBookCodes, 0);
                admin.addClient(library, client);
                break;
            case 10:
                System.out.println("Print user list");
                admin.printUserList(library);
                break;
            case 11:
                System.out.println("View borrowed book from user");
                System.out.println("Insert user:");
                String user1 = console.nextLine();
                admin.viewBorrowedBooksCodesByClient(library, user1);
                break;
            case 12:
                System.out.println("Delete user");
                String user2 = console.nextLine();
                admin.deleteClient(library, user2);
            case 13:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Insert your option!");
        }

    }

    public static void doClientActions(int option, Scanner console, Library library, Client client) {
        switch (option) {
            case 1:
                System.out.println("Search book by ISBNCode");
                System.out.println("Insert ISBNCode:");
                String ISBNCode = console.nextLine();
                library.searchBookByCode(ISBNCode);
                break;
            case 2:
                System.out.println("Search book by title");
                System.out.println("Insert title: ");
                String title1 = console.nextLine();
                library.searchBookByTitle(title1);
                break;
            case 3:
                System.out.println("Search book by author: ");
                System.out.println("Insert author: ");
                String author1 = console.nextLine();
                library.searchBookByAuthor(author1);
                break;
            case 4:
                System.out.println("List all books from library");
                library.listAllBooks(library);
                break;
            case 5:
                System.out.println("List book details from library by ISBNCode");
                System.out.println("Insert ISBNCode: ");
                String ISBNCode1 = console.nextLine();
                library.listBookDetails(library, ISBNCode1);
                break;
            case 6:
                System.out.println("View borrowed books codes");
                client.viewBorrowedBooksCodes();
                break;
            case 7:
                System.out.println("Borrow book");
                System.out.println("Insert ISBNCode: ");
                String ISBNCode2 = console.nextLine();
                try {
                    client.borrowBook("ffff", library);
                } catch (BookNotFoundException | BookNotAvailableException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 8:
                System.out.println("Return book");
                String ISBNCode3 = console.nextLine();
                try {
                    client.returnBook(library, "");
                } catch (BookNotFoundToBeReturned e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 9:
                System.out.println("Print borrowed books");
                client.viewBorrowedBooksCodes();
                break;
            case 10:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Insert your option!");

        }


    }
}



