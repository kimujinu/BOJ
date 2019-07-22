import java.util.Arrays;
import java.util.Scanner;

public class BOJ5554 {
	Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		BOJ5554 Main = new BOJ5554();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		solve(a,b,c,d);
		}
		  
	public void solve(int a,int b,int c, int d) {
		int tmp = a+b+c+d;
		int m = 0;
		int s = 0;
		while(tmp>=60) {
				m++;
				tmp = tmp-60;
		}
		s = tmp;
		System.out.println(m);
		System.out.println(s);
		
	}
}
