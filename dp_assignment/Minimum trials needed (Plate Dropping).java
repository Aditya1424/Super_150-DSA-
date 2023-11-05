// Minimum trials needed (Plate Dropping)


import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner  adi =new Scanner(System.in);

        int t= adi.nextInt();
        while(t-->0){

            int k= adi.nextInt();
            int n=adi.nextInt();
            int dp[][]= new int[k+1][n+1];
			
			for(int i=0;i<k;i++){
				for(int j=0;j<n;j++){
					dp[i][j]= 0;
				}
			}

            System.out.println(Adi(k,n,dp));
        }
    }


    public static int Adi(int n,int k, int dp[][]){

        if(n==1){
			return k;
		}

        if(k<=1){
			return k;
		}

        int ans= Integer.MAX_VALUE;

        if(dp[n][k]!= 0){
			return dp[n][k];
		}

        for(int i=1;i<=k;i++){

            int a = Math.max(Adi(n-1,i-1,dp), Adi(n,k-i,dp));
            ans = Math.min(ans,a);

        }


        return dp[n][k]= ans+1;
    }
}
