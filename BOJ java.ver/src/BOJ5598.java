import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ5598 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ5598 Main = new BOJ5598();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		String input = scan.next();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)-68<0) {
				System.out.print((char)(input.charAt(i)+23));
			}else {
				System.out.print((char)(input.charAt(i)-3));
			}
		}
	}	
}