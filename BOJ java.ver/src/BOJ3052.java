import java.util.Arrays;
import java.util.Scanner;

public class BOJ3052 {
	Scanner scan = new Scanner(System.in);
	int count=1;

	public static void main(String[] args) {
		BOJ3052 Main = new BOJ3052();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		int tmp[] = new int[10];
		int array[] = new int[10];
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			tmp[i] = array[i]%42;
		}
		Arrays.sort(tmp);
		for(int i=0;i<9;i++) {
			if(tmp[i]!=tmp[i+1]) {
				count++;
			}
		}
		System.out.print(count);
	}
}
