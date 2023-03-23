import java.util.*;
class Bubblesort{

    static void swap(int a[],int x,int y){
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    public static void main(String[] args) {

        Scanner I =new Scanner(System.in );
        int arr[]={9,8,7,6,5,4,3,2,1};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    Bubblesort.swap(arr,j+1,j);
                }
            }
        }
        for(int i=0;i<arr.length;i++ ){
            System.out.println(arr[i]);
        }
    }
}