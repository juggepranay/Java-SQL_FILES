import java.util.*;
// closet string
class stringexp2{
  static int x,y;
    public static void main(String[] args){
      String [] a ={"the","pranay","jugge","moula","karthikesh"};
      
      String s1="the";
      String s2="karthikesh";
      for(int i=0;i<=a.length-1;i++)
      {
      if(s1==a[i]){
         x=i;
      } 
      else if(s2==a[i]){
         y=i;
      } 
    }
    int res=y-x;
    System.out.println(res);
}
}