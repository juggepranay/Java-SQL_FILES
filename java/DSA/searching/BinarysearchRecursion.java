class BinarysearchRecursion{
    public int search(int a[],int key,int low, int high){
        if(low>high) return -1;

        int mid=(int)(low+high)/2;
        if(a[mid]==key){
            return mid;
        }
        else if (a[mid]>key)
        {
            return search(a,key,low,mid-1);
        }
        else{
            return search(a,key,mid+1,high);
        }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        BinarysearchRecursion b=new BinarysearchRecursion();
        System.out.println(b.search(a, 7, 0, a.length));
        
    }
}