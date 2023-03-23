// swap number without using the third variable

class Swap{
    static void swap(int x,int y){
        y=x+y;
        x=y-x;
        y=y-x;
        System.out.println("x ="+x+"y ="+y);

    }

    public static void main(String[] args) {
        swap(4, 5);
    }
}