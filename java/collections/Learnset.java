// import java.beans.IntrospectionException;
// import java.io.Serial;
// import java.util.Comparator;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

// class Learnset{
//     public static void main(String[] args) {

//         // Set has only unique elements if we have add element already exists if will not add to the set 
        
//         Set<Integer> s=new HashSet<>();

//         // linkedhash set ha linked each element to the next element

//         Set<Integer> Sl=new LinkedHashSet<>();

//         // treehashset sort the elements


//         Set<Integer> ts=new TreeSet<>();
//         s.add(211);
//         s.add(3);
//         s.add(100);
//         s.add(20);

//         Sl.add(12);
//         Sl.add(21);
//         Sl.add(32);
//         Sl.add(34);



//         ts.add(33);
//         ts.add(3);
//         ts.add(2);
//         ts.add(10);

//         System.out.println(s);
//         System.out.println(Sl);
//         System.out.println(ts);

//     }
// }
/**
 * Learnset
 */
public class Learnset {

    public static void main(String[] args) {
        String s="123+342*12+12/343/767+4534%454";
        int index=0;
        String res="";
        String num1="";
            String num2="";
            char c='#';
        while (index<s.length()) {
            
            if(c=='#'&&Character.isDigit(s.charAt(index))&&num1==""){
                while (index<s.length()&& Character.isDigit(s.charAt(index))) {
                    num1+=s.charAt(index++);
                    
                }
            }else if(num2==""){
                while (index<s.length()&& Character.isDigit(s.charAt(index))) {
                    num2+=s.charAt(index++);
                }
            }
            if(index<s.length()&&c=='#')
            c=s.charAt(index++);
            if(num1!=""&&num2!=""){
                switch (c) {
                    case '+':

                    res=String.valueOf(Integer.parseInt(num1)+Integer.parseUnsignedInt(num2));
                    num1=res;
                    num2="";
                    c='#';
                        break;
                        case '-':
                        res=String.valueOf(Integer.parseInt(num1)-Integer.parseUnsignedInt(num2));
                        num1=res;
                        num2="";
                        c='#';
                break;
                case '*':
                res=String.valueOf(Integer.parseInt(num1)*Integer.parseUnsignedInt(num2));
                num1=res;
                num2="";
                c='#';
                break;
                case '/':
                res=String.valueOf(Integer.parseInt(num1)/Integer.parseUnsignedInt(num2));
                num1=res;
                num2="";
                c='#';
                break;
                case '%':
                res=String.valueOf(Integer.parseInt(num1)%Integer.parseUnsignedInt(num2));
                num1=res;
                num2="";
                c='#';
                break;
                    default:
                        break;
                }

            }
        }
        System.out.println(res);
    }
}