package neebalgurukul.day3;

import java.util.Scanner;

public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=(n-i+1);j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
