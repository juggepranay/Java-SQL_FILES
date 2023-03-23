class Quicksort{

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    static void quicksort(int arr[],int l,int h){
        if(l<h){
            int pivot=partition(arr,l,h);
            quicksort(arr,l,pivot-1);
            quicksort(arr,pivot+1,h);

        }
    }

   static int partition(int a[],int l, int h){
        int pivot=l;
        int i=l;int j=h;
        while(i<j){
            while(a[i]<=pivot)
            i++;
            while(a[j]>pivot) 
            j--;
            if(i<j){
            swap(a,l,h);
            }
        }
        swap(a,j,l);

        return j;

    }


    public static void main(String[] args) {

        int a[]={100,90,80,70,60,50,40,30,20,10};

        quicksort(a,0,a.length-1);




        
    }
}