/*  1
    2 4
    1 3 5
    2 4 6 8
    1 3 5 7 9 */

    class p_2
    { 
        public static void main(String args[]) 
    { 
    
    for(int i= 1;i<=5;i++){
        for(int j=1;j<=i;j++){
            if(!(j%2==0))
            System.out.print(i);
        }
        System.out.println();
    }
        } 
    } 