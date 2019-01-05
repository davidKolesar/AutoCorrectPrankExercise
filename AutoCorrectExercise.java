import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
  public static String autocorrect(String input) {
        //Regex seeks out instances of you
        final Pattern youInstance = Pattern.compile("([yY][oO])([uU])+(\\W)*");
        //Regex seeks out instances of u
        final Pattern uInstance = Pattern.compile("\\s*[uU]\\s*");
        final String[] words = input.split("\\s");
        
        for (int i = 0; i < words.length; i++)
        {
            if (youInstance.matcher(words[i]).matches())
            {
                words[i] = youInstance.matcher(words[i]).replaceAll("your sister$3");
            }
            else if (uInstance.matcher(words[i]).matches())
            {
                words[i] = uInstance.matcher(words[i]).replaceAll("your sister");
            }
        }
        return String.join(" ", words);
    }
}