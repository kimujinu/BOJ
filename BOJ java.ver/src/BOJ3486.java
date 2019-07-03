import java.util.Scanner;

public class BOJ3486 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	
	public static void main(String[] args) {
		BOJ3486 Main = new BOJ3486();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		solve(a);
		}
		  
		
	public void solve(int n) {
		int result1 = 0;
		int result2 = 0;
		int result = 0;
		int tmp=0;
		int a =0;
		int b = 0;
		for(int i=0;i<n;i++) {
			a = scan.nextInt();
			b = scan.nextInt();
		while(a!=0) {
			result1 = result1 * 10 + a % 10;
			a/=10;
		}
		while(b!=0) {
			result2 = result2 * 10 + b % 10;
			b /= 10;
		}
		tmp = result1 + result2;
		while(tmp!=0) {
			result = result *10 + tmp %10;
			tmp /=10;
		}
		System.out.println(result);
		result = 0;
		result1 = 0;
		result2 = 0;
		}
	}

}
