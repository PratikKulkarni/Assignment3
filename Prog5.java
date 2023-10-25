package neebalgurukul.day3;

public class Prog5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=(2*n-1);i++) {
			
			if(i<=n) {
				for(int j=(n-i);j>=1;j--) {
					System.out.print("  ");
				}
				System.out.print(i+" ");
				for(int j=1;j<=(2*(i-1)-1);j++) {
					System.out.print("  ");
				}
				if(i!=1)
				System.out.print(i+" ");
			}else {
				for(int j=1;j<=(i-n);j++) {
					System.out.print("  ");
				}
				System.out.print(n-(i-n));
				for(int j=2*(n-(i-n)-1)-1;j>=1;j--) {
					System.out.print("  ");
				}
				if(i!=(2*n-1))
				System.out.print(n-(i-n));
			}
			System.out.println();
		}
	}

}
