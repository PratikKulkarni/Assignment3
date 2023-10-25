package neebalgurukul.day3;

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(i-1);j++) {
				System.out.print("  ");
			}
			if((i==1) || (i==n)) {
				for(int j=1;j<=(2*n);j++) {
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
				for(int j=1;j<=(2*n-2);j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
