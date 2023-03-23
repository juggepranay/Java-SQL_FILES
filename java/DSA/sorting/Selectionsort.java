class Selectionsort{
    public static void main(String[] args) {
        int arr[]={4,1,9,2,3,6,22,231,1,3};

        for(int i=0;i<arr.length-1;i++){
            int min =arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}