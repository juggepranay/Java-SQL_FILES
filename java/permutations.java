class permutations{

    public static void main(String[] args) {

    //     String s="abc";
    //     String res="";
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i+1;j<s.length();j++){
    //             res=swap(s,i,j);
    //             System.out.println(res);
    //             res="";
    //         }
    //     }
        
    // }
    // static String swap(String s,int i,int j){

    //     return s;

   per("123","");
    }
    
    static void per(String s,String res){
        if(s.length()==0){
            System.out.println(res);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            String newString =s.substring(0, i)+s.substring(i+1);
            per(newString, c+res);
        }
    }
}