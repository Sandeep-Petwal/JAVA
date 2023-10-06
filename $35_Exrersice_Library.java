
//methods issue return showavailble books
//properties array to show stored book
class Library {
    String[] books;
    int bookCount, limit;

    Library(int limit) {
        this.limit = limit;
        books = new String[limit];
        bookCount = 0;
    }

    boolean checkBookAvailibility(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            if (bookName == books[i]) {
                return true;
            }
        }
        return false;
    }

    void addBook(String bookName) {
        if (bookCount == limit) {
            System.out.println("SORRY , maximum limit of books in library " + limit + " is reached.\n\tcan't add "+bookName);
            return;
        } else if (checkBookAvailibility(bookName)) {
            System.out.println("!! " + bookName + " - Book is already present. can't add book.");
            return;
        }
        books[bookCount] = bookName;
        System.out.println("++ \"" + bookName + "\" Has been added successfully.");
        bookCount++;
    }

    void showBooks() {
        System.out.println("\nAvailble books : ----------------------");
        int i = 1;
        if (bookCount == 0) {
            System.out.println("------ Library is empty -------");
            return;
        }
        for (String b : books) {
            if (b == null) {
                continue; // won't show empty books.
            }
            System.out.println("\t" + i + ". " + b);
            i++;
        }
        System.out.printf("%-17s----------------------\n","");
    }

    void issueBook(String removeBook) // means removing book frome library
    {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == removeBook) {
                books[i] = null;
                System.out.println("-- \"" + removeBook + "\" Book is issued successfully.");
                bookCount--;
                return;
            }
        }
        System.out.println("\"" + removeBook + "\" Book is not found in library !");
    }

    void Book() {
    }
}

public class $35_Exrersice_Library {
    public static void main(String[] args) {
        System.out.println(".....................Libray..................\n");
        Library l1 = new Library(5);
        l1.addBook("Akigai");
        l1.addBook("Do epic shit");
        l1.addBook("Do epic shit");
        l1.addBook("C++");
        l1.addBook("Ramayana");
        l1.addBook("the fifth book");

        l1.showBooks();

        l1.addBook("the fifth book 2nd edition");
        l1.issueBook("C++");
        l1.showBooks();

        l1.addBook("Ramayana");

    }
}