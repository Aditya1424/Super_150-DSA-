// House Robber II


import java.util.*;
public class Main {
    public static void main (String args[]) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.println(Math.max(rob(a,0,n-2),rob(a,1,n-1)));
    }


    public static int rob(int a[],int s,int e){
        int last=0;
        int  max=0;

        for(int i=s;i<=e;i++){
            max= Math.max(a[i]+last, last=max);
        }

        return max;
    }
}
