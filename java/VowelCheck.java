import java.util.regex.Matcher;
import java.util.regex.Pattern;

class VowelCheck{
    public boolean check(String i){
            
        Pattern n=Pattern.compile(".*[aeiou].*");
        Matcher m=n.matcher(i.toLowerCase());

        if (m.find()){
            return true;
        }
        else{
            return false;
        }


    }

    public static void main(String[] args) {
        
        VowelCheck obj=new VowelCheck();
        System.out.println(obj.check("PRANAY"));
        
    }
}