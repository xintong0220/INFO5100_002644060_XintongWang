import java.util.List;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LibraryApp {
    // Serialization Method
    public static void serializeObject(Object object, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(object);

            out.close();
            fileOut.close();

            System.out.println(object.getClass().getSimpleName() + " has been serialized");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Deserialization Method
    public static Object deserializeObject(String filename) {
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Object object = in.readObject();

            in.close();
            fileIn.close();

            System.out.println(object.getClass().getSimpleName() + " has been deserialized");
            return object;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("ONYX STORM", "Rebecca Yarros", "Short story", "1339000059"));
        library.addBook(new Book("Dune", "Frank Herbert", "Fiction", "1745000041"));
        library.addBook(new Book("The Teacher","Freida McFadden","Thriller","1021000055"));
        library.addBook(new Book("Dog Man","Dav Pilkey","Children's Book","2932000190"));
        library.addBook(new Book("First Lie Wins","Ashley Elston","Thriller","1701000844"));

        // Displaying all available books
        System.out.println("Available books:");
        library.displayAvailableBooks();

        // Searching books
        System.out.println();
        System.out.println("Searching books by keywords \"Frank\":");
        List<Book> searchResult = library.searchBooks("Frank");
        System.out.println(searchResult);

        // Removing books
        System.out.println();
        System.out.println("Removing books from library by ISBN:");
        // The book exists in library
        String isbn1 = "1339000059";
        String isbn2 = "1111111111";
        if (library.removeBookByISBN(isbn1)) {
            System.out.println("The book with ISBN " + isbn1 + " exists in library and is removed.");
        }
        else {
            System.out.println("The book with ISBN " + isbn1 + " does not exist in library and cannot be removed.");
        }
        // The book does not exist
        if (library.removeBookByISBN(isbn2)) {
            System.out.println("The book with ISBN " + isbn2 + " exists in library and is removed.");
        }
        else {
            System.out.println("The book with ISBN " + isbn2 + " does not exist in library and cannot be removed.");
        }

        // Checking out a book
        System.out.println();
        System.out.println("Checking out a book by ISBN:");
        // The book exists
        String isbn3 = "1701000844";
        String isbn4 = "2222222222";
        if (library.checkOutBook(isbn3)) {
            System.out.println("The book with ISBN " + isbn3 + " is checked out.");
        }
        else {
            System.out.println("The book with ISBN " + isbn3 + " does not exist in library and cannot be checked out.");
        }
        // The book does not exist
        if (library.checkOutBook(isbn4)) {
            System.out.println("The book with ISBN " + isbn4 + " is checked out.");
        }
        else {
            System.out.println("The book with ISBN " + isbn4 + " does not exist in library and cannot be checked out.");
        }

        // Returning a book
        System.out.println();
        System.out.println("Returning a book by ISBN:");
        library.returnBook(isbn3);
        System.out.println("The book with ISBN " + isbn3 + " is returned.");

        // Displaying all available books after returning
        System.out.println();
        System.out.println("Available books after returning:");
        library.displayAvailableBooks();

        // Serialize library object
        System.out.println();
        serializeObject(library,"library.ser");

        // Deserialize library object
        Library deserializedLibrary = (Library) deserializeObject("library.ser");
    }
}