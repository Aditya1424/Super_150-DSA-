// Length of LCS


import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner adi =new Scanner(System.in);


        String a  = adi.next();
        String b = adi.next();


        int dp[][] =new int[a.length()+1][b.length()+1];

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(a.charAt(i-1)== (b.charAt(j-1))){
                    dp[i][j] = 1+dp[i-1][j-1];
                }

                else {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
		
		System.out.println(dp[dp.length-1][dp[0].length-1]);
    }
}
