class MaxSum{
    public static void main(String[] args) {

        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
         
int checksum=0,sum=0;
        for(int i=0;i<nums.length;i++){
            checksum=checksum+nums[i];
            if(checksum>0 && checksum>sum){
                sum=checksum;

            }else if(checksum<0){
                checksum=0;
            }
                
        }
        System.out.println(sum);
    }        
}