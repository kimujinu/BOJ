import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1904 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1904 Main = new BOJ1904();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int[] array = new int[n+1];
		array[1] = 1; //array[3] = 100,001,111
		array[2] = 2; //array[4] = 0011,0000,1001,1100,1111;
		for(int i=3;i<=n;i++){
			array[i] = array[i-1]+array[i-2];
			array[i]%=15746;
		}
		System.out.println(array[n]);
		
	}	
}