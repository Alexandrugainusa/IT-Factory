import org.apache.commons.lang3.StringEscapeUtils;
//
import java.util.regex.Pattern;


public class Hello {

    private static final Pattern UNICODE_PATTERN = Pattern.compile("\\\\u([0-9A-Fa-f]{4})");
    public static String unescapeUnicode(String unescaped) {
        return UNICODE_PATTERN.matcher(unescaped).replaceAll(r -> String.valueOf((char) Integer.parseInt(r.group(1), 16)));
    }

    public static void main(String[] args) {

        String hello = "\\u0048\\u0065\\u006C\\u006C\\u006F" + " \\u0057\\u006f\\u0072\\u006c\\u0064";
        String message = unescapeUnicode(hello);
        System.out.println(message);

    }
}
