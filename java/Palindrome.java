class Palindrome{


    public boolean check(String s){
        boolean result=true; 
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-i-1)){
             result=false;}

        }
        return result;

    }

    
    public static void main(String[] args) {
        

        Palindrome p=new Palindrome();
        System.out.println(p.check("lolo"));
    }
}