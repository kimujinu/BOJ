import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {
	Scanner scan = new Scanner(System.in);
	int sum = 0;


	public static void main(String[] args) {
		BOJ11399 Main = new BOJ11399();
		Main.start();
	}
	
	public void start() {
		int k = scan.nextInt();
		solve(k);
		}
		  
		
	public void solve(int k) {
		int[] array = new int[k+1];
		for(int i=1;i<=k;i++) {
		array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for(int j=1;j<=k;j++) {
			array[j] = array[j-1] + array[j];
			sum += array[j];
		}
		System.out.print(sum);
		
	}
}
