import java.util.Scanner;

public class BOJ2200 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	
	
	public static void main(String[] args) {
		BOJ2200 Main = new BOJ2200();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
		
	public void solve(int n) {
		int input = scan.nextInt();
		for(int i=0;i<n;i++) {
			count+=2;
			int a = scan.nextInt();
			if(a !=0) {
				count += 1 + (int)Math.log10((double) a) + 1;
			}
		}
		System.out.print(count);
	}

}
