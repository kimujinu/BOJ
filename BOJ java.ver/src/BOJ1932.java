import java.util.Scanner;

public class BOJ1932 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ1932 Main = new BOJ1932();
		Main.start();
	}
	public void start() {
		solution();
	}
	public void solution() {
		int max= 0;
		int n = scan.nextInt();
		int[][] dp = new int[n][n];
		
		dp[0][0] = scan.nextInt();
		for(int i = 1; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				dp[i][j] = scan.nextInt();
				
				if(j == 0)
					dp[i][j] += dp[i-1][j];
				else if(j == i)
					dp[i][j] += dp[i-1][j-1];
				else
					dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
				
				max = Math.max(max, dp[i][j]);
			}
		}
		System.out.println(max);
	}
}