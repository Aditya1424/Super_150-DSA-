// Tilling Problem - I


import java.util.*;
public class Main {
    public static void main (String args[]) {
		
		Scanner adi =new Scanner(System.in);
        int n= adi.nextInt();
        long x=0, y=1;

        long res=0;

        for(int i=0;i<n;i++){
            res =x+y;
            x= y;
            y= res;
        }
        System.out.println(res);
    }
}
