// Exchanging Coins

import java.util.*;
public class Main {
    public static void main(String args[]) {


		Scanner adi =new Scanner(System.in);
        int n = adi.nextInt();

       HashMap<Integer,Long> dp =new HashMap<>();

        System.out.println(Adi(n,dp));
    }


    public static long Adi(int n, Map<Integer,Long> dp){
        if(n==0){
			return 0;
		}

        if(dp.containsKey(n)){
			return dp.get(n);
		}

		long a=  Adi(n/2,dp);
		long b =  Adi(n/3,dp);
		long c =  Adi(n/4,dp);

		long res= a+b+c;


        long ans = Math.max(n, res);

        dp.put(n,ans);
        return ans;
    }
}
