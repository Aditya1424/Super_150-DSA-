// Number of Steps to reach 1


import java.util.*;

public class Main{
    public static void main(String []args){

        Scanner adi= new Scanner(System.in);

        int num= adi.nextInt();

        System.out.println(Steps(num,0));


    }

    public static int Steps(int n,int c){

        if(n==1){
            return c;
        }

        int b=0;

        if((n&1)==0){
         return  Steps(n>>1,c+1);
        }

        else{
        b+= Math.min(Steps(n-1,c+1),Steps(n+1,c+1));
        }

        return b;
    }
}
