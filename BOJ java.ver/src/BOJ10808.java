import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10808 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ10808 Main = new BOJ10808();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		String input = scan.next();
		int[] result = new int[26];
		for(int i=0;i<input.length();i++) {
			int temp = input.charAt(i)-97;
			result[temp] += 1;
		}
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}