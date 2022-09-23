package libraryBookOOP;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    public Admin() {

    }


    public void addBook(Library library, Book book) {
        Book searchBook = library.searchBookByCode(book.getISBNCode());
        if (!"".equals(searchBook.getISBNCode())) {
            searchBook.setNumbersTotalOfCopies(searchBook.getNumbersTotalOfCopies() + 1);
            System.out.println("The book is on list,so you have a copy");
        } else {
            library.getBookList()[library.getNumberOfBooks()] = book;
            library.setNumberOfBooks(library.getNumberOfBooks() + 1);
            System.out.println("The book was added to library");
        }
    }
    //va adauga o carte in lista de carti a bibliotecii.
    // Daca cartea cu acel ISBNCode exista deja in lista de carti a bibliotecii,
    // atunci doar i se va incrementa valoarea atributului numberOfCopies


    public void deleteBook(Library library, String ISBNCode) {
        int index = getBookIndex(library, ISBNCode);
        for (int i = index + 1; i < library.getBookList().length; i++) {
            library.getBookList()[i - 1] = library.getBookList()[i];
        }
        library.getBookList()[library.getNumberOfBooks()] = null;
        library.setNumberOfBooks(library.getNumberOfBooks() - 1);
        System.out.println("The book was deleted from library");
    }


    public void deleteBook(Library library, String ISBNCode, int numbersOfCopies) {
        Book foundBookForDelete = library.searchBookByCode(ISBNCode);
        foundBookForDelete.setNumbersTotalOfCopies(foundBookForDelete.getNumbersTotalOfCopies() - numbersOfCopies);
        System.out.println("You delete a book copy from library");
    }

    //Va fi o metoda supraincarcata
    //1.Prima varianta va primi doar un paramentru, ISBNCode si va sterge de tot cartea din lista de carti a bibliotecii
    //A doua varianta va primi doi paremetrii: ISBNCode si numarul de copii care se vor sterge.
    // In acest caz, cartea nu va fi stearsa din lista de carti a bibliotecii,
    // ci doar se va scadea din numarul total de copii al cartii, numarul de copii primit ca parametru


    public int getBookIndex(Library library, String ISBNCode) {
        for (int i = 0; i < library.getBookList().length; i++) {
            if (ISBNCode.equals(library.getBookList()[i].getISBNCode())) {
                return i;
            }
        }
        return -1;
    }

    public void addClient(Library library, Client client) {
        Client foundClient = searchClient(library, client.getName());
        if (client.getName().equals(foundClient.getName())) {
            System.out.println("The client is on list");
        } else {
            library.getUserList()[library.getNumberOfUsers()] = client;
            library.setNumberOfUsers(library.getNumberOfUsers() + 1);
            System.out.println("The client was added on list");
        }
    }

    public void printUserList(Library library) {
        for (int i = 0; i < library.getNumberOfUsers(); i++) {
            System.out.println(library.getUserList()[i].getName());
        }
    }

    public Client searchClient(Library library, String name) {
        for (int i = 0; i < library.getNumberOfUsers(); i++) {
            if (name.equals(library.getUserList()[i].getName())) {
                return (Client) library.getUserList()[i];
            }
        }
        return new Client();
    }

    public void viewBorrowedBooksCodesByClient(Library library, String name) {
        //1. cautam clientul dupa nume in lista de useri din librarie
        //2. daca am gasit clientul, printam codurile cartilor imprumutate de client
        Client foundClient = searchClient(library, getName());
        if (name.equals(foundClient.getName())) {
            foundClient.viewBorrowedBooksCodes();
        }
    }

    public void deleteClient(Library library, String name) {
        int index = getIndexUser(library, name);
        for (int i = index; i < library.getNumberOfUsers(); i++) {
            library.getUserList()[i] = library.getUserList()[i + 1];
        }
        library.getUserList()[library.getNumberOfUsers()] = null;
        library.setNumberOfUsers(library.getNumberOfUsers() - 1);
    }

    public int getIndexUser(Library library, String name) {
        for (int i = 0; i < library.getNumberOfUsers(); i++) {
            if (library.getUserList()[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }


}

