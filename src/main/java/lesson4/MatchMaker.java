package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchMaker {

    final static String PATTERN = "(?<=(\"login\":\")).+?(?=\",)";

    public static Matcher getMatcher(String input){
        Pattern pattern = Pattern.compile(PATTERN);
        return pattern.matcher(input);
    }


}
