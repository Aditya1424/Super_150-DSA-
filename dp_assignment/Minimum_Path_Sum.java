// Minimum Path Sum


import java.util.*;
public class Main {
    public static void main (String args[]) {


        Scanner sc=new Scanner(System.in);


        int n=sc.nextInt();
        int m=sc.nextInt();


        int dp[][]=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0&&j==0){
                    dp[i][j]=sc.nextInt();
                }

                else if(i==0){
                    dp[i][j]=sc.nextInt()+dp[i][j-1];
                }


                else if(j==0){
                    dp[i][j]=sc.nextInt()+dp[i-1][j];
                }

                else{
                    dp[i][j] =sc.nextInt()+Math.min(dp[i-1][j],dp[i][j-1]);
                } 
            }
        }
        System.out.println(dp[n-1][m-1]);
    }
}
