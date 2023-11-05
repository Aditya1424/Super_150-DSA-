// Optimal Game Strategy-II


import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner adi =new Scanner(System.in);

        int n= adi.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
			a[i]= adi.nextInt();
		}

        Long dp[][] =new Long[n][n];

        System.out.println(Aditya(a,0,n-1,dp));
    }

    public static long Aditya(int a[],int i,int j,Long dp[][]){

        if(i>j){
			return 0;
		}
		
        if(dp[i][j]!=null){
			return dp[i][j];
		}

        long f= a[i] + Math.min(Aditya(a,i+2,j,dp),Aditya(a,i+1,j-1,dp));

        long l= a[j]+ Math.min(Aditya(a,i+1,j-1,dp),Aditya(a,i,j-2,dp));


        return dp[i][j]=Math.max(f,l);
    }
}
