// Ugly Numbers

import java.util.*;
public class Main {
    public static void main(String args[]) {

		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n =sc.nextInt();
            long dp[] = new long[n];
            dp[0]=1;

            long f2=2,f3=3,f5=5;
			int i2=0,i3=0,i5=0;

            for(int i=1;i<n;i++){
                long min=Math.min(f2,Math.min(f3,f5));
                dp[i]=min;

                if(f2==min){
					f2 =2*dp[++i2];
				}

                if(f3==min){
					f3= 3*dp[++i3];
				}

                if(f5==min){
					f5= 5*dp[++i5];
				}

            }
            System.out.println(dp[n-1]);
        }
    }
}
