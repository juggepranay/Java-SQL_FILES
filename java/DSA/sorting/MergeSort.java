class MergeSort{
    public void sort(int arr[],int l,int r){
        if(l>=r) return;
            int mid=(l+r)/2;
            sort(arr,l,mid);
            sort(arr,mid+1,r);
            merge(arr,l,mid,r);
    }

    public void merge(int arr[],int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=l;
        int b[]=new int[arr.length];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                b[k]=arr[i];
                i++;
            }
            else if(arr[j]<arr[i]){
                b[k]=arr[j];
                j++;
            }
            k++;
        }

        if(i>mid){
            while(j<=r){
                b[k]=arr[j];
                k++;j++;
            }
        }
        else{
            while(i<=mid){
                b[k]=arr[i];
                k++;i++;
            }
        }

        for(k=l;k<=r;k++){
            arr[k]=b[k];
            System.out.println(arr[k]);

        }
    }

    public static void main(String[] args) {

        MergeSort m=new MergeSort();
        int a[]={3,2,1,4,5,3,5};
        m.sort(a,0,a.length-1);


        
    }
}