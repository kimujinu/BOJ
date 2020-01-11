import java.util.Scanner;


public class BOJ1463 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ1463 Main = new BOJ1463();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int n = scan.nextInt();
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i=2;i<=n;i++){
			dp[i] = dp[i-1]+1;
			if(i%2 == 0)
				dp[i]=Math.min(dp[i/2]+1, dp[i]);
			if(i%3==0)
				dp[i]=Math.min(dp[i/3]+1,dp[i]);
		}
		System.out.print(dp[n]);
	}

}
