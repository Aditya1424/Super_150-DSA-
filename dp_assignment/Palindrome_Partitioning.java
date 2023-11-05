// Palindrome Partitioning


import java.util.*;
public class Main {
    public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){

            String s=sc.next();
            Integer dp[]=new Integer[s.length()];

            System.out.println(Partitioning(s,0,new ArrayList<>(),dp));
        }
    }


    public static int Partitioning(String ques,int i,List<String> ll,Integer dp[]){
        if(ques.length()==i){
            return -1;
        }

        if(dp[i]!=null){
			return dp[i];
		}

        int ans =Integer.MAX_VALUE;

        for (int cut = 1;i+ cut <= ques.length(); cut++){
            String s=ques.substring(i,i+cut);

            if(isPalin(s)){
                ll.add(s);
                ans=Math.min(ans,1+Partitioning(ques,i+cut,ll,dp));
                ll.remove(ll.size()-1);
            }
        }
        return dp[i]=ans;
    }


    public static boolean isPalin(String s){
        int i=0;
		int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
				return false;
			}

            i++;
			j--;
        }

        return true;
    }
}
