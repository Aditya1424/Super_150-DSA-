// Smart Robber


import java.util.*;
public class Main {
    public static void main (String args[]) {

		Scanner adi= new Scanner(System.in);

		int t= adi.nextInt();

		while(t-->0){
			int num= adi.nextInt();

			int arr[]= new int[num];

			for(int i=0;i<num;i++){
				arr[i]= adi.nextInt();
			}

			int dp[]= new int[num+1];

			for(int i=0;i<dp.length;i++){
				dp[i]=-1;
			}

			System.out.println(Robber(arr,0,dp));

		}
	}

		public static int Robber(int arr[],int i,int dp[]){
			if(i>=arr.length){
				return 0;
			}

			if(dp[i]!=-1){
				return dp[i];
			}

			int a= arr[i]+Robber(arr,i+2,dp);

			int b= Robber(arr,i+1,dp);

			return dp[i]= Math.max(a,b);
		}

    
}
