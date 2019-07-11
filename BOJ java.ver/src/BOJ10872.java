import java.util.Scanner;

public class BOJ10872 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ10872 Main = new BOJ10872();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		System.out.print(solve(n));
		}
		  
	public int solve(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*solve(n-1);
		}
	}
}
