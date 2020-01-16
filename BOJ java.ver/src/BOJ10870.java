import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ10870 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ10870 Main = new BOJ10870();
		Main.start();

	}
	public void start() throws IOException{
		int n = scan.nextInt();
		System.out.print(solution(n));
	}
	public int solution(int n) throws IOException {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else
			return solution(n-1)+solution(n-2);
	}	
}