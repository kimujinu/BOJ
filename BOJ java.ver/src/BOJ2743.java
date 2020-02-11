import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2743 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2743 Main = new BOJ2743();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		String input = scan.next();
		System.out.println(input.length());
	}
}