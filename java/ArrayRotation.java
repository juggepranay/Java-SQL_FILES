class ArrayRotation{
    public static void main(String[] args) {
        int x=2;
        int a[]={1,2,3,4,5,6,7};
        int temp=0;
        int lenth=a.length;

        while(x>=0){
            temp=a[0];
            for(int i=1;i<lenth;i++){
                a[i-1]=a[i];
            }
            a[a.length-1]=temp;
            x--;

        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}