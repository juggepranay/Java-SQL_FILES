class MatrixAddition{
    public static void main(String[] args) {
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int b[][]={{1,2,3},{1,2,3},{1,2,3}};
        int x=0;
        for(int i=0;i<a.length;i++){
            while(a[i][x]<3){
                System.out.print(a[i][x]+b[i][x]+" ");
                x++;
            }
            x=0;
            System.out.println();
        }
    }
}