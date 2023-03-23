class problem_1{
    public static void main(String[] args) {
        int n=123921;
        String s=String.valueOf(n);
        
        String ch[] = new String[s.length()];

        for(int i=0;i<s.length();i++){
            ch=s.split("");
        }
        int max=0;

        for(int i=0;i<s.length();i++){
            int x=Integer.parseInt(ch[i]);
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);



        
    }
}