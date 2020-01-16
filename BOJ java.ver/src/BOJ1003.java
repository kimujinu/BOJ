import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1003 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1003 Main = new BOJ1003();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int[] zeroarray = new int[41];
		int[] onearray = new int[41];
		int[] array = new int[n];
		for(int i=0;i<n;i++){
			array[i] = scan.nextInt();
		}
		zeroarray[0] = 1;
		zeroarray[1] = 0;
		onearray[0] = 0;
		onearray[1] = 1;
		
		for(int i=2;i<41;i++){
			zeroarray[i] = zeroarray[i-1] + zeroarray[i-2];
			onearray[i] = onearray[i-1] + onearray[i-2];
		}
		for(int i=0;i<array.length;i++){
			System.out.println(zeroarray[array[i]]+" "+onearray[array[i]]);
		}
	}	
}