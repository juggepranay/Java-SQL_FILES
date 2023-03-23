class Binarysearch{
    public int search(int arr[],int key){
        int l=0; int h=arr.length-1;
        int mid =(int)(l+h)/2;
        while(l<=h){
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        Binarysearch b=new Binarysearch();
        int a[]={1,2,3,4,5,6};

        int find=b.search(a,7);
        System.out.print(find);

    }
}