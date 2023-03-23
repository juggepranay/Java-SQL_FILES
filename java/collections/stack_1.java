import java.util.List;
import java.util.Stack;;

class stacK_1{
public static void main(String[] args) {
    Stack<String> names=new Stack<>();

    names.push("PRANAY");
    names.push("kiran");
    names.push("moula");
    names.push("karthikesh");

    System.out.println(names.peek()); 

    names.pop();
    System.out.println(names.peek());
    System.out.println(names);


}
}