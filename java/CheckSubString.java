// check the string if the substring available or not;

class CheckSubString{
    public static void main(String[] args) {
        String s= "abc";

        StringBuilder s2=new StringBuilder("abcde");

        StringBuilder x=new StringBuilder(s);

        for(int i=0;i<s2.length();i++){
            String z=String.valueOf(s2.charAt(i));
            if(x.contains(z)){

                // x.delete(x.indexOf(s2.charAt(i)),x.indexOf(s2.charAt(i)));
                if(x.length()==0){
                    System.out.println(s2.substring(i-3, i));
                }
            }
             else{
                x="abc";

            }

        }
        System.out.println("element not found");
        
        
    }
}




