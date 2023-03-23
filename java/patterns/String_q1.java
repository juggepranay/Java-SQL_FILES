// replace space with underscore
class String_q1{
    public String replace(String x){
        return x.replace(' ', '_');

    }
    public static void main(String[] args) {

        String_q1 q=new String_q1();
        System.out.println(q.replace("hello world"));
        System.out.println(q.replace("JUGGE PRANAY"));
        
    }

}