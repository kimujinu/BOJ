import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11726 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ11726 Main = new BOJ11726();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int[] dp = new int[1001];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-1] + dp[i-2];
			dp[i]%=10007; 
		}
		System.out.print(dp[n]);
	}
}