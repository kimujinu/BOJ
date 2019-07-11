import java.util.Scanner;

public class BOJ11654 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	
	public static void main(String[] args) {
		BOJ11654 Main = new BOJ11654();
		Main.start();
	}
	
	public void start() {
		int a = scan.next().charAt(0);
		solve(a);
		}
		  
		
	public void solve(int n) {
		System.out.print(n);
	}

}
