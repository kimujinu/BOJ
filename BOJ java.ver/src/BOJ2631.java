import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ2631 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2631 Main = new BOJ2631();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int a = scan.nextInt();
		int[] b = new int[a+1];
		int[] dp = new int[a+1];
		for(int i=1;i<=a;i++){
			b[i] = scan.nextInt();
		}
		for(int i=1;i<=a;i++){
			dp[i] = 1;
			for(int j=1;j<i;j++){
				if(b[i]>b[j] && dp[i]<=dp[j]){
					dp[i] = dp[j]+1;
				}
			}
		}
		Arrays.sort(dp);
		System.out.print(a-dp[a]);
	}
	
	}
