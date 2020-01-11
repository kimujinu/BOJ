import java.math.BigInteger;
import java.util.Scanner;



public class BOJ15740 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ15740 Main = new BOJ15740();
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
