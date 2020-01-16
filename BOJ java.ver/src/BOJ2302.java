import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2302 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2302 Main = new BOJ2302();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] dp = new int[n+1];
		int[] vip = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-1]+dp[i-2];
		}
		int num = 1;
		for(int i=1;i<=m;i++){
			vip[i] = scan.nextInt();
			num*=dp[vip[i]-vip[i-1]-1];
		}
		num *= dp[n-vip[m]];
		System.out.print(num);
	}
}