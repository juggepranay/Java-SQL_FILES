import java.util.Arrays;

/*Input: {"geeksforgeeks", "geeks", "geek", "geezer"}
Output: "gee"

Input: {"apple", "ape", "april"}
Output: "ap"*/
class Stingprefix{
    public static void main(String[] args) {
        String a[]={"geeks","geee","geeksfor","ge"};
        Arrays.sort(a);
        int end =Math.min(a[0].length(),a[a.length-1].length());
        int i=0;
        while(i<end && a[0].charAt(i)==a[a.length-1].charAt(i)){
            i++;

        }
        String LongestPre=a[0].substring(0,i);
        System.out.println(LongestPre);



    }
}