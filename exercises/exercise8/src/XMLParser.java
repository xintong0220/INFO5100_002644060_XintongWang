import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("bookshelf.xml");

            document.getDocumentElement().normalize();

            System.out.println("Initial XML:");
            printXML(document);

            addBook(document, "The Alone Time", "2024", "316", new String[]{"Elle Marr"});

            System.out.println();
            System.out.println("Updated XML:");
            printXML(document);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printXML(Document document) {
        NodeList nodeList = document.getElementsByTagName("Book");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                String title = element.getElementsByTagName("title").item(0).getTextContent();
                String year = element.getElementsByTagName("publishedYear").item(0).getTextContent();
                String pages = element.getElementsByTagName("numberOfPages").item(0).getTextContent();
                String author = element.getElementsByTagName("author").item(0).getTextContent();

                System.out.println("Book " + (i + 1) + ":");
                System.out.println("\tTitle: " + title);
                System.out.println("\tPublished Year: " + year);
                System.out.println("\tNumber of Pages: " + pages);
                System.out.println("\tAuthor: " + author);
            }
        }
    }

    public static void addBook(Document doc, String title, String year, String pages, String[] authors) {
        Node root = doc.getFirstChild();

        Element newBook = doc.createElement("Book");
        Element newTitle = doc.createElement("title");
        newTitle.appendChild(doc.createTextNode(title));
        Element newYear = doc.createElement("publishedYear");
        newYear.appendChild(doc.createTextNode(year));
        Element newPages = doc.createElement("numberOfPages");
        newPages.appendChild(doc.createTextNode(pages));
        Element newAuthors = doc.createElement("authors");
        for (String author : authors) {
            Element newAuthor = doc.createElement("author");
            newAuthor.appendChild(doc.createTextNode(author));
            newAuthors.appendChild(newAuthor);
        }

        newBook.appendChild(newTitle);
        newBook.appendChild(newYear);
        newBook.appendChild(newPages);
        newBook.appendChild(newAuthors);
        root.appendChild(newBook);
    }
}