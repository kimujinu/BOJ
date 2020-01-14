import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11727 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ11727 Main = new BOJ11727();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for(int i=3;i<=n;i++){ //다이나믹 프로그래밍 Bottom-up 방식
			dp[i] = dp[i-1] + 2*dp[i-2];
			dp[i]%=10007; 
		}
		System.out.print(dp[n]);
	}
}