public class Fibonnaci

{
	public static void main(String[] args) {
		int i=0;
		System.out.print(i+" ");
		int j=1;
		System.out.print(j+" ");
		int k=0;
		while(k<55){
		    k=i+j;
		    System.out.print(k+" ");
		    i=j;
		    j=k;
		    
	}
}
}
