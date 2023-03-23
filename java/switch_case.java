
import java.util.Scanner;


class switch_case_1{
    char h;

    switch (h) {
        case 'A':
            System.out.println("it is case A");
            break;
        default:
            break;
    }

}




class switch_case{
public static void main(String[] args) {
    
int key;
Scanner sc=new Scanner(System.in);
System.out.print("select case:");
key = sc.nextInt();


 switch (key) {
    case 0:
        System.out.println("case 0 here");
        break;
    case 1:
        System.out.println("case 1 here");
        break;

    default:
        System.out.println("please enter a valid case");
        break;
}
}
}