// K-Ordered LCS


import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner adi =new Scanner(System.in);

        int n= adi.nextInt();
        int m= adi.nextInt();
        int k= adi.nextInt();

        int a[]=new int[n];

        int b[]=new int[m];

        for(int i=0;i<n;i++){
			a[i]= adi.nextInt();
		}

        for(int i=0;i<m;i++){
			b[i]= adi.nextInt();
		}

        Integer dp[][][] =new Integer[n][m][k+1];

        System.out.println(Lcs(a,b,0,0,k,dp));
    }
    public static int Lcs(int a[],int b[],int i,int j,int k,Integer dp[][][]){

        if(i==a.length || j==b.length){
			return 0;
		}

        if(dp[i][j][k] !=null){
			return dp[i][j][k];
		}

        int ans=0;
        if(a[i]==b[j]){
            ans= 1+Lcs(a,b,i+1,j+1,k,dp);
        }

        else{
            ans= Lcs(a,b,i+1,j,k,dp);
            ans =Math.max(Lcs(a,b,i,j+1,k,dp),ans);

            if(k>0){
                ans=Math.max(ans,1 +Lcs(a,b,i+1,j+1,k-1,dp));
            }
        }

        return dp[i][j][k] =ans;
    }
}
