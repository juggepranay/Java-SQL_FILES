import java.util.ArrayList;
import java.util.List;

class Checkodd{
    public boolean check(List<Integer> x){
        for(int i:x){
            if (i % 2 == 0)
			return false;
	}

	return true;
}



    public static void main(String[] args) {

        Checkodd obj=new Checkodd();
        List<Integer> n=new ArrayList<>();
        n.add(5);
        n.add(3);

        System.out.println(obj.check(n));
        
    }
}