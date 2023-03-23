class Stringarray{
    public static void main(String[] args) {
        String arr[]=new String[10];

        String s="this is a string question";

        for(int i=0;i<s.length();i++){
            arr=s.split(" ");
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}