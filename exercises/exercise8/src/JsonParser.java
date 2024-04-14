import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class JsonParser {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            FileReader reader = new FileReader("bookshelf.json");

            Object object = parser.parse(reader);
            JSONObject jsonObject = (JSONObject) object;
            JSONArray bookList = (JSONArray) jsonObject.get("BookShelf");

            System.out.println("Initial JSON:");
            printJSON(bookList);

            addBook(bookList,"The Alone Time", "2024", "316", new String[]{"Elle Marr"});

            System.out.println();
            System.out.println("Updated JSON:");
            printJSON(bookList);
        }
        catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void printJSON(JSONArray bookList) {
        for (Object object : bookList) {
            JSONObject book = (JSONObject) object;
            System.out.println("Title : " + book.get("title"));
            System.out.println("Published Year : " + book.get("publishedYear"));
            System.out.println("Number of Pages : " + book.get("numberOfPages"));
            System.out.println("Authors : " + book.get("authors"));
            System.out.println();
        }
    }

    public static void addBook(JSONArray bookList, String title, String year, String pages, String[] authors) {
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("publishedYear", year);
        newBook.put("numberOfPages", pages);
        newBook.put("authors", Arrays.asList(authors));
        bookList.add(newBook);
    }
}
