import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2864 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2864 Main = new BOJ2864();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int A = scan.nextInt();
		int B = scan.nextInt();
		String amin = Integer.toString(A);
		String amax = Integer.toString(A);
		String bmin = Integer.toString(B);
		String bmax = Integer.toString(B);
		int Amin = Integer.parseInt(amin.replace('6', '5'));
		int Amax = Integer.parseInt(amax.replace('5', '6'));
		int Bmin = Integer.parseInt(bmin.replace('6', '5'));
		int Bmax = Integer.parseInt(bmax.replace('5', '6'));
		
		System.out.println((Amin+Bmin)+" "+(Amax+Bmax));

	}
}