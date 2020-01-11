import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10610 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ10610 Main = new BOJ10610();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		String a = in.readLine();
		int[] array = new int[a.length()];
		int sum = 0;
		for(int i=0;i<a.length();i++){
			sum+=Integer.parseInt(a.charAt(i)+"");
			array[i] = Integer.parseInt(a.charAt(i)+"");
		}
		if(a.contains("0")&& sum%3==0){ //30의배수의 조건
			Arrays.sort(array);
			for(int i=0;i<array.length/2;i++){
				int temp = array[i];
				array[i] = array[(array.length-1)-i];
				array[(array.length-1)-i] = temp;
			}
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]);
			}
		}else{
			System.out.print("-1");
		}
		
	}	
}