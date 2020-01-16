import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2748 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2748 Main = new BOJ2748();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		long[] array = new long[91];
		array[0] = 0;
		array[1] = 1;
		for(int i=2;i<=n;i++){
			array[i] = array[i-1]+array[i-2];
		}
		System.out.println(array[n]);
		
	}
}