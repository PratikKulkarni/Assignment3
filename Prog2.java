package neebalgurukul.day3;

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println("Please enter the value of n");
		//int n=sc.nextInt();
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("  ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
