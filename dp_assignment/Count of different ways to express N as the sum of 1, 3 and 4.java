// Count of different ways to express N as the sum of 1, 3 and 4



import java.util.*;
public class Main {
    public static void main (String args[]) {

		Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();


        int coins[]=new int[3];

        Long dp[]=new Long[n+1];

        coins[0]=1;
		coins[1]=3;
		coins[2]=4;

        System.out.println(change(n,coins,dp));
    }


    public static long change(int amount, int[] coins,Long dp[]) {
        if(amount ==0){
			return 1;
		}
        if(dp[amount]!=null){
			
			return dp[amount];
		}


        long ans=0;

        for(int i=0;i<3;i++){
            if(amount-coins[i]>=0){
                ans+=change(amount-coins[i],coins,dp);
            }
        }
		
        return dp[amount]=ans;
	}
}
