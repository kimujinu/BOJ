import java.util.Scanner;

public class BOJ10886 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BOJ10886 Main = new BOJ10886();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
	public void solve(int n) {
		int count0=0;
		int count1=0;
		int array[] = new int[n];
		for(int i=0;i<array.length;i++) {
			array[i]=scan.nextInt();
			if(array[i]==1) {
				count1++;
			}else {
				count0++;
			}
		}
		if(count0>count1) {
			System.out.print("Junhee is not cute!");
		}else {
			System.out.print("Junhee is cute!");
		}
		
	}
}
