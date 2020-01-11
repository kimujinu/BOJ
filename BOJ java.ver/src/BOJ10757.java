import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ10757 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ10757 Main = new BOJ10757();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		BigInteger b1 = scan.nextBigInteger();
		BigInteger b2 = scan.nextBigInteger();
		BigInteger result;
		result = b1.add(b2);
		System.out.println(result.toString());
	}

}
