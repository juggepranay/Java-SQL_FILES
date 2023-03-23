import java.util.regex.Matcher;
import java.util.regex.Pattern;

class regex_1{
    public static void main(String[] args) {
        Pattern p=Pattern.compile("^(\\d\\d)[a-z|A-Z]{3}(\\d{4})$");
        Matcher matcher=p.matcher("19MIA1083");
        System.out.println(matcher.find());
        int a=Integer.valueOf(matcher.group(2))/Integer.valueOf(matcher.group(1));
        System.out.println(a);


        

        

    }
}