class Multiplication{
    public static void main(String[] args) {

        int a[][]={
            {1,3,2},
            {3,1,1},
            {1,2,2}
        };

        int b[][]={
            {2,1,1},
            {1,0,1},
            {1,3,1}
        };

        int a_rows=a.length;
        int a_cols=a[0].length;
        int b_rows=b.length;
        int b_cols=b[0].length;

        


        if(a_rows==b_cols){
            int prod[][]=new int[3][3];
        for(int i=0;i<a_rows;i++){
            for(int j=0;j<b_cols;j++){
                for(int k=0;k<b_rows;k++){
                    prod[i][j] = prod[i][j] + a[i][k] * b[k][j]; 
                }
            }
        }
        }else{
            System.out.println("Cannot multiply");
        }


        for(int i=0;)



    }
}