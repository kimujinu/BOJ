import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ5063 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		BOJ5063 Main = new BOJ5063();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		int n = scan.nextInt();
		String [] result = new String[n];
		for(int i=0;i<n;i++) {
			int r = scan.nextInt();
			int e = scan.nextInt();
			int c = scan.nextInt();
			
			if(e-c<r) {
				result[i] = "do not advertise";
			}else if(e-c>r) {
				result[i] = "advertise";
			}else if(e-c==r) {
				result[i] = "does not matter";
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
