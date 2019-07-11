import java.util.Arrays;
import java.util.Scanner;

public class BOJ2675 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BOJ2675 Main = new BOJ2675();
		Main.start();
	}
	
	public void start() {
		int t = scan.nextInt();
		solve(t);
		}
		  
	public void solve(int t) {
		String array[] = new String[t];
		Arrays.fill(array, "");
		for(int i=0;i<t;i++) {
			int a = scan.nextInt();
			String b = scan.next();
			for(int j=0;j<b.length();j++) {
				for(int h=0;h<a;h++) {
					array[i] += b.charAt(j);
				}
			}
		}
		for(int i=0;i<t;i++) {
			
		System.out.println(array[i]);
			
		}
		
		
	}
}
