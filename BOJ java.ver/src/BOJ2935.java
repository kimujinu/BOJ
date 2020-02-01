import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BOJ2935 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2935 main = new BOJ2935();
		main.start();
	}
	public void start() throws IOException {
		solution();
	}
	public void solution() throws IOException {
		BigInteger a = new BigInteger(scan.next());
		String r = scan.next();
		BigInteger b = new BigInteger(scan.next());
		
		if(r.equals("+")) {
			System.out.print(a.add(b));
		}else if(r.equals("*")) {
			System.out.print(a.multiply(b));
		}
	}
}
