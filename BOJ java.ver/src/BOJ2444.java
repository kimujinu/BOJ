import java.util.Scanner;

public class BOJ2444 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ2444 Main = new BOJ2444();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int N = scan.nextInt();
		
		for(int i = 1; i <= N ; i++) {
			for(int j = 0; j < N-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = N-1; i >= 0 ; i--) {
			for(int j = 0; j < N-i; j++)
				System.out.print(" ");
			for(int j = 0; j < i*2-1; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
