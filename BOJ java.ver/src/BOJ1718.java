import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1718 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1718 Main = new BOJ1718();
		Main.start();
	}
	public void start() throws IOException {
		solve();
	}
	public void solve() throws IOException {
		String input = in.readLine();
		String input2 = in.readLine();
		String result = "";
		for(int i=0;i<input.length();i++) {
			int str = input.charAt(i) - input2.charAt(i%input2.length()) - 1;
			
			if(input.charAt(i)==' ') {
				result += ' ';
			}else if(str >= 0) {
				result += (char)('a'+str);
			}else {
				result += (char)('z'+str+1);
			}
		}
		System.out.println(result);
	}
}
