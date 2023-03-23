class p_7{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int s=5-i;s>=1;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=0;k<i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
