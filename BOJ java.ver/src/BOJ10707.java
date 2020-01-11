import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ10707 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ10707 Main = new BOJ10707();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int x_liter = scan.nextInt();
		int y_basic_fee = scan.nextInt();
		int maximum = scan.nextInt();
		int add_fee = scan.nextInt();
		int usage = scan.nextInt();
		int totalx = 0;
		int totaly = 0;
		
		totalx = x_liter * usage;
		
		if(usage<maximum){
			totaly = y_basic_fee;
		}
		else if(usage > maximum){
			totaly = y_basic_fee +((usage-maximum)*add_fee);
		}
		
		if(totalx<totaly){
			System.out.print(totalx);
		}else{
			System.out.print(totaly);
		}
		
	}
}