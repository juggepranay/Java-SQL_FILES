class arrays_1
{
    public static void main(String[] args) {
        int arr[]=new int[20];

        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        for(int x:arr){
            System.out.println(x);
        }



        // for(int i=0;i<10;i++){
        //     if(arr[i]%2==0){
        //         System.out.println("even number");
        //     }
        //     else{
        //         System.out.println("odd number");
        //     }
        // }
        int number= 1;

            int arr2 [][]=new int[4][4];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    arr2[i][j]=number;
                    number++;
                }
            }

                int sum=0;
                for(int l=0;l<4;l++){
                    for(int m=0;m<4;m++){
                        System.out.println(arr2[l][m]);
                        if(l+m==3 || l==m){
                           sum= arr2[l][m]+sum;
                        }

                    }
            }
            System.out.println("sum="+sum);
  

           



    }
}