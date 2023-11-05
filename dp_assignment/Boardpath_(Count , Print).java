// Boardpath(Count , Print)


import java.util.*;
public class Main {
    public static void main(String args[]) {
        
		Scanner adi= new Scanner(System.in);

		int n= adi.nextInt();
		int m =adi.nextInt();

		System.out.println("\n"+Count(n,m,""));

    }

	public static int Count(int n,int m,String s){

		if(n==0){
			System.out.print(s+" ");
			return 1;
		}

		if(n<0){
			return 0;
		}

		int ans=0;

		for(int i=1;i<=m;i++){
			ans= ans+ Count(n-i,m, s+i);
		}

		return ans;
	}
}
