import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11052 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ11052 Main = new BOJ11052();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int[] array = new int[n+1];
		int[] dp = new int[n+1];
		for(int i=1;i<=n;i++){
			array[i] = scan.nextInt();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				dp[i] = Math.max(dp[i],dp[i-j]+array[j]);
			}
		}
		System.out.print(dp[n]);
		
	}
}