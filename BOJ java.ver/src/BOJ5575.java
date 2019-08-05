import java.util.Scanner;

public class BOJ5575 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ5575 Main = new BOJ5575();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		for(int i=0;i<3;i++) {
			int a = scan.nextInt()*3600+scan.nextInt()*60+scan.nextInt();
			int b = scan.nextInt()*3600+scan.nextInt()*60+scan.nextInt();
			int c = b-a;
			System.out.println((c/3600));
			System.out.println((c%3600)/60);
			System.out.println(((c%3600)%60));
		}
		
	}
}
