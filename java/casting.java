public class casting{

    public void take(double x)
    {
        float y = (float) x;
        int z = (int) y;
        System.out.println("output  "+z);

    }
    public static void main(String[] args) {
        casting s=new casting();
        double a=2.99;
        s.take(a);


      
    }
        
}

