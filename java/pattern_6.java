//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1
class pattern_6{
    public static void main(String args[]){

        int k=5;

        for(int i=1;i<=4;i++){

            for(int s1=k;s1>=1;s1--){
 
                System.out.print(" ");
            }

            k=k-1;

            for(int j=i;j>=1;j--){

                System.out.print(j);
            }
            
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }


            System.out.println();
        }
        int k1=4;

        for(int i=3;i>=1;i--){
            for(int s2=5;s2>=k1-1;s2--){
                System.out.print(" ");
            }
            k1=k1-1;
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }

    }
}