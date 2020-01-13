import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2798 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2798 Main = new BOJ2798();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] array = new int[n];
		int result =0;
		for(int i=0;i<n;i++){
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<array.length-2;i++){
			for(int j=i+1;j<array.length-1;j++){
				for(int k=j+1;k<array.length;k++){
					int temp = array[i] + array[j] + array[k];
					if(temp<=m){
						result = Math.max(temp, result);
					}
				}
			}
		}
		System.out.print(result);
	
	}
}