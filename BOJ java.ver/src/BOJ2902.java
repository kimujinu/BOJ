import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2902 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2902 Main = new BOJ2902();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		String input = scan.next();
		System.out.print(input.charAt(0));
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='-'){
				System.out.print(input.charAt(i+1));
			}
		}
	}	
}