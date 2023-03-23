class MaxMin{
    public static void main(String[] args) {
        int arr[]={4,3,25,63,1};
        int x=0;int y=arr.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(x<arr.length && y>0){
            if(arr[x]<min){
                min=arr[x];
                
            }
            if(arr[y]>max){
                max=arr[y];
                
            }
            x++;
            y--;
            
        }
        for (int i : arr) {
            min=Math.min(min, i);
            max=Math.max(max, i);
        }
        System.out.println("min: "+ min+" max: "+max);

    }
}