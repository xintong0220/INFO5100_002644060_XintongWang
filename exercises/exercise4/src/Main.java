import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static boolean checkRegex(String regex, String cases) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cases);
        return matcher.matches();
    }

    public static void checkCases(String subject, String regex, String positiveCase, String negativeCase) {
        System.out.println("The Subject String is: " + subject);
        System.out.println("The Regular Expression Pattern is: " + regex);

        if(checkRegex(regex, positiveCase)) {
            System.out.println(positiveCase + " matches regular expression.");
        }

        if(!checkRegex(regex, negativeCase)) {
            System.out.println(negativeCase + " dose not match regular expression.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        checkCases("US Phone Number", "^\\(\\d{3}\\) \\d{3}-\\d{4}$", "(530) 408-1061", "530-408-1061");
        checkCases("US Zip Code", "^\\d{5}$", "95112", "9511a");
        checkCases("Date(MM-DD-YYYY)", "^\\d{2}-\\d{2}-\\d{4}$", "03-22-2024", "2024-03-22");
        checkCases("Time(HH-mm)", "^(2[0-3]|[01]?[0-9]):([0-5][0-9])$", "23:10", "25:60");
        checkCases("Email Address", "^[\\w.-]+@[\\w]+\\.[\\w]{2,6}$", "wangxintong@gmail.com", "wangxintong@com");
    }
}