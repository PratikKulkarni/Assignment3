package neebalgurukul.day3;

public class Prog4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=(n-i);j>=1;j--) {
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			for(int j=1;j<=(i-1);j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();
		}
	}

}
