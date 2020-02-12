import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11656 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ11656 Main = new BOJ11656();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		String input = scan.next();
		String[] result = new String[input.length()];
		for(int i=0;i<input.length();i++) {
			result[i] = input.substring(i,input.length());
		}
		Arrays.sort(result);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}	
}