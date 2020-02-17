import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1371 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1371 Main = new BOJ1371();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int result = 0;
		int[] alpha = new int[26];
		while(scan.hasNextLine()) {
			String input = scan.nextLine();
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i)!=' ') {
					alpha[input.charAt(i)-'a']++;
					if(result<alpha[input.charAt(i)-'a']) {
						result = alpha[input.charAt(i)-'a'];
					}
				}
			}
		}
		for(int i=0;i<alpha.length;i++) {
			if(alpha[i]==result) {
				System.out.print((char)(i+'a'));
			}
		}
	}	
}