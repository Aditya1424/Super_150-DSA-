// Climbing Stairs


import java.util.*;
public class Main {
    public static void main (String args[]) {
		Scanner adi= new Scanner(System.in);

		int num= adi.nextInt();

		System.out.println(Count(num));


    }

	public static int Count(int n){

		if(n==0 || n==1){
			return 1;
		}
		
		int a= Count(n-1);
		int b= Count(n-2);

		return a+b;
	}
}
