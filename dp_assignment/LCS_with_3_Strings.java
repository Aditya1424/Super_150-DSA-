// LCS with 3 Strings


import java.util.*;
public class Main{
    public static void main(String args[]) {

        Scanner  adi=new Scanner(System.in);
        String a= adi.next();
        String b= adi.next();
        String c= adi.next();

        Integer dp[][][]= new Integer[a.length()][b.length()][c.length()];

        System.out.println(Aditya(a,b,c,0,0,0,dp));
    }



    public static int Aditya(String a, String b, String c,int i,int j,int k,Integer dp[][][]){

        if(i==a.length() || j==b.length() || k==c.length()){
			return 0;
		}

        if(dp[i][j][k]!=null){
			return dp[i][j][k];
		}

        int ans=0;
        if(a.charAt(i)==b.charAt(j) && a.charAt(i)==c.charAt(k)){
            ans=1+ Aditya(a,b,c,i+1,j+1,k+1,dp);
        }
        else{

            ans= Aditya(a,b,c,i,j,k+1,dp);
            ans= Math.max(ans,Aditya(a,b,c,i,j+1,k,dp));
            ans= Math.max(ans,Aditya(a,b,c,i+1,j,k,dp));
        }
		
		
        return dp[i][j][k]=ans;
    }
}
