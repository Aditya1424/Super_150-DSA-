// Coin Change


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);


        int a=sc.nextInt();
        int n=sc.nextInt();

        int c[] =new int[n];
        for(int i=0;i<n;i++){
			c[i] =sc.nextInt();
		}

        System.out.println(change(a,c));

    }



    public static int change(int amount, int c[]) {
		
        int dp[][] =new int[c.length+1][amount+1];

        for(int i=0;i<dp.length;i++){
			dp[i][0]=1;
		}

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                int inc=0;
				int exc=0;

                if(c[i-1]<=j){
                    inc=  dp[i][j-c[i-1]];
                }
                exc  =dp[i-1][j];
                dp[i][j]= inc+exc;
            }
        }

        return dp[dp.length-1][dp[0].length-1];
    }
}
