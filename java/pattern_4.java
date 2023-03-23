
// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 


class pattern_4{
    public static void main(String[] args){

        for(int i=0;i<5;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=5;k>0;k--){
            for(int l=k;l>0;l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}