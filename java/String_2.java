class String_2{
    public static void main(String[] args) {
        String s="hello world".intern();
        String s1="hai";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3,7));
        System.out.println(s.contains("hello"));
        System.out.println(s1.equals(s));
        System.out.println(s.concat(" "+s1));
        System.out.println(s.replace("hello", "hehe"));
        String s2=" HELLO WORLD ";    
        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s.split(" "));
        System.out.println(s==s2);
        System.out.println(s.indexOf('l'));
        System.out.println(s.indexOf("world"));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.trim());
        int i = 3;
        char arr[]={'a','b','c'};
        System.out.println(String.valueOf(arr));
        System.out.println(new String(arr));

        



    }
}

/**
 * String_2
 */
// public class String_2 {

//     public static void main(String[] args) {
//         String s="abc";
//         int arr[]=new int[26];
//         for(char c:s.toCharArray()){
//             arr[c-'a']++;
//         }
//      for (int i = 0; i < arr.length; i++) {
//         if(arr[i]==0)
//         System.out.print((char)(i+'a')+" ");
//      }
//      System.out.println();
//     }
// }