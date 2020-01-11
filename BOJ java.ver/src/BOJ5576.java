import java.util.Arrays;
import java.util.Scanner;

public class BOJ5576 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ5576 Main = new BOJ5576();
		Main.start();
	}
	
	public void start() {	
		solve();
	}
	
	public void solve() {
		int array[] = new int[10];
		int array2[] = new int[10];
		int wteam = 0;
		int kteam = 0;
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int i=0;i<array2.length;i++) {
			array2[i] = scan.nextInt();
		}
		Arrays.sort(array);
		Arrays.sort(array2);
		
		wteam = array[array.length-1]+array[array.length-2]+array[array.length-3];
		kteam = array2[array2.length-1]+array2[array2.length-2]+array2[array2.length-3];

		System.out.print(wteam+" "+kteam);
	}
	
	
	

}
