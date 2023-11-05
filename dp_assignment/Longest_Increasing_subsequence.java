// Longest Increasing subsequence


import java.util.*;
public class Main {
    public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

        System.out.println(lengthOfLIS(a));
    }



    public static int lengthOfLIS(int[] nums) {
        int dp[]=new int[nums.length];

        dp[0]=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>dp[len-1]){
                dp[len++]=nums[i];
                continue;
            }

            int l=0;
			int h= len-1;
            int ans= -1;


            while(l <=h){
                int mid= (l+h)/2;

                if(dp[mid]>=nums[i]){
                    ans=mid;
                    h =mid-1;
                }

                else{
					l = mid+1;
				}
            }

            dp[ans]=nums[i];
        }


        return len;
    }
}
