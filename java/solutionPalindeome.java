class Solution {
    public boolean isPalindrome(String s) {
         if(s==" "){
            return true;
        }

        s=s.toLowerCase();
        char [] x=new char[s.length()];
        if(s.length()==1){
            return true;
        }
        int k=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)<='z' && s.charAt(i)>='a'){
            x[k]=s.charAt(i);
            k++;
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                x[k]=s.charAt(i);
                k++;
            }
            count++;
            }
        }
        System.out.println(Arrays.toString(x));
        // System.out.println(count);
       int i=0;
       int j=count-1;
       if(j==0){
           return true; 
       }
       if(j==1 && x[0]!=x[1]){
           return false;

       }
       while(i<j)
       {
           if(x[i]==x[j]){
               i++;
               j--;
           }else{
               return false;
           }
       }
        return true;
    }
}