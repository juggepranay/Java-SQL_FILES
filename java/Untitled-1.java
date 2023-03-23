// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
class pattern_5{
    public static void main(String args[]){
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=k;j<k+i;j++){
                System.out.print(" "+j);
            }
            k=k+i;
            System.out.println();

        }
    }
}

