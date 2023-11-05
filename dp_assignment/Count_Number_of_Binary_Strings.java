// Count Number of Binary Strings


import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner adi= new Scanner(System.in);

		int t= adi.nextInt();

		while(t-->0){
			int num= adi.nextInt();

			long dp[] = new long[num+1];

			Arrays.fill(dp,-1);

			System.out.println(Adi(num,0,dp));
		}
    }

	public static long Adi(int n, int i, long dp[]){

		if(i>=n){
			return 1L;
		}

		if(dp[i]!= -1){

			return dp[i];
		}

		long a= Adi(n,i+2,dp);
		long b= Adi(n,i+1,dp);

		return dp[i]= a+b;


		
	}
}
