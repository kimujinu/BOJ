import java.util.Scanner;

public class BOJ5565 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BOJ5565 Main = new BOJ5565();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
		
	public void solve(int n) {
		int price = 0;
		for(int i=0;i<9;i++) {
			price = scan.nextInt();
			n-=price;
		}
		System.out.print(n);
		
	}

}
