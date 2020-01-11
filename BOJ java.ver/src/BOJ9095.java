import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ9095 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ9095 Main = new BOJ9095();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int a = scan.nextInt();
		int[] array = new int[11];
		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 4;
		for(int j =0;j<a;j++){
			int b = scan.nextInt();
			for(int i=4;i<=b;i++){
				array[i] = array[i-1] + array[i-2] + array[i-3];
			}
			System.out.println(array[b]);
		}
	}
	
	}
