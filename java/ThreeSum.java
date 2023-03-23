import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum{
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int element1,k,l;
        while(i<j){
            List<Integer> x=new ArrayList<>();
            k=i+1;
            l=arr.length-1;
            element1=arr[i];
            if(element1<0){
                while(k<l){
                    if(arr[k]+arr[l]==Math.abs(element1)){
                        x.add(element1);
                        x.add(arr[k]);
                        x.add(arr[l]);
                        res.add(x);
                    }
                    else if(arr[k]+arr[l]>element1){
                        j--;
                    }
                    else if(arr[k]+arr[l]<element1){
                        k++;
                    }
                
                }
            }else if(element1>0){

                while(k<l){
                    if(arr[k]+arr[l]==(element1*-1)){
                        x.add(element1);
                        x.add(arr[k]);
                        x.add(arr[l]);
                        res.add(x);
                    }
                    else if(arr[k]+arr[l]>element1){
                        j--;
                    }
                    else if(arr[k]+arr[l]<element1){
                        k++;
                    }
                
                }
                
            }

            i++;
            
        }
        System.out.println(res);
       
    }
}