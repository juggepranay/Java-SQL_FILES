public class Sample {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int t=7;
        System.out.println(doFind(arr,11));
    }

    private static int doFind(int[] arr, int t) {
        int min=Integer.MAX_VALUE;
        int sum=0;
        int left=0;
        int temp=0;
        for (int i = 0; i < arr.length&&temp<arr.length; i++) {
            sum+=arr[i];

            int count=0;
            if(sum>=t){
                while (sum>0) {
                    sum-=arr[left++];
                    count++;
                }
                temp++;
                left=temp;
                min=Math.min(min, count);
                i=temp;
            }
            
        }
        return min;
    }
}
