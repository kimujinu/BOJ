import java.util.Arrays;
import java.util.Scanner;

public class BOJ5597 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ5597 Main = new BOJ5597();
		Main.start();
	}
	
	public void start() {	
		solve();
	}
	
	public void solve() {
		boolean[] array = new boolean[31];
		Arrays.fill(array,false);
		for(int i=0;i<28;i++) {
			array[scan.nextInt()] = true;
		}
		for(int i=1;i<=30;i++) {
			if(array[i]==false) {
				System.out.println(i);
			}
		}
	
	}
	
	
	

}
