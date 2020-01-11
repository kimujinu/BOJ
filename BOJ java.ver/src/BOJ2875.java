import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class BOJ2875 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2875 Main = new BOJ2875();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int team = 0;
		while(n+m>=k+3 && n>=2 &&m>=1){
			team++;
			m--;
			n-=2;
		}
		System.out.print(team);
		
	}	
}