import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ1919 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ1919 Main = new BOJ1919();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		String input = scan.next();
		String input2 = scan.next();
		int[] alpha = new int[26];
		int[] alpha2 = new int[26];
		int total = 0;
		
		for(int i=0;i<input.length();i++) {
			alpha[input.charAt(i)-97]++;
		}
		for(int i=0;i<input2.length();i++) {
			alpha2[input2.charAt(i)-97]++;
		}
		
		for(int i=0;i<26;i++) {
			if(alpha[i]==alpha2[i]) {
				continue;
			}else {
				total += Math.abs(alpha[i]-alpha2[i]);
			}
		}
		System.out.println(total);
	}
}