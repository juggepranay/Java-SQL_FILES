import java.util.Arrays;

class LearnArraysClass{
    public static void main(String[] args) {
        int a[]={2,32,2,2,34,532};


        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,3));

        Arrays.fill(a,12);

        for(int i:a){
            System.out.println(i);

        }
    }
}