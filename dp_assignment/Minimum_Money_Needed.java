// Minimum Money Needed

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner adi =new Scanner(System.in);

        int n= adi.nextInt();
        int w= adi.nextInt();

        int v[]=new int[w];

        for(int i=0;i<w;i++){
			v[i]= adi.nextInt();
		}

        long dp[][]= new long[1001][1001];

        for(long d[]:dp){
            Arrays.fill(d,-1);
        }

        System.out.println(Aditya(w,w,v,dp));
    }



    public static long Aditya(int n,int w,int v[],long dp[][]){

        if(w==0){
			return 0;
		}

        if(n==0){
			return Integer.MAX_VALUE;
		}

        if(dp[n][w]!=-1){
			return dp[n][w];
		}

        long ans= Aditya(n-1,w,v,dp);
        if(w<n || v[n-1]==-1){
			return ans;
		}

        ans= Math.min(ans,v[n-1]+ Aditya(n,w-n,v,dp));
        return dp[n][w]=ans;
    }
}
