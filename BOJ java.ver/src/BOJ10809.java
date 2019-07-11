import java.util.Scanner;

public class BOJ10809 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BOJ10809 Main = new BOJ10809();
		Main.start();
	}
	
	public void start() {
		String n = scan.next();
		solve(n);
		}
		  
	public void solve(String n) {
		for(char a='a';a<='z';a++) {
			System.out.print(n.indexOf(a)+" ");
		}
	}
}
