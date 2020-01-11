import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ3034 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ3034 Main = new BOJ3034();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		double c = Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
		for(int i=0;i<n;i++){
			int s = scan.nextInt();
			if(s<=c){
				System.out.println("DA");
			}else{
				System.out.println("NE");
			}
		}
		
		
	}
}