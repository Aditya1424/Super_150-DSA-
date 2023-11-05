
// Valentine Magic

import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner adi =new Scanner(System.in);

        int n= adi.nextInt();
        int m= adi.nextInt();

		int b[]=new int[n];
		int g[]=new int[m];


        for(int i=0;i<n;i++){
			b[i]=adi.nextInt();
		}

        for(int i=0;i<m;i++){
			g[i]=adi.nextInt();
		}
        Arrays.sort(b);
        Arrays.sort(g);

        int dp[][]=new int[n][m];
		

        System.out.println(Aditya(b,g,0,0,dp));
    }




    public static int Aditya(int []boys, int []girls,int i,int j,int dp[][]){

        if(i==boys.length){
			return 0;
		}

        if(j==girls.length){
			return 10000000;
		}

        if(dp[i][j]!= 0){
			return dp[i][j];
		}

        int pair = Math.abs(boys[i]-girls[j]) + Aditya(boys,girls,i+1,j+1,dp);

        int nopair = Aditya(boys,girls,i,j+1,dp);

        return dp[i][j] = Math.min(pair,nopair);
    }
}
