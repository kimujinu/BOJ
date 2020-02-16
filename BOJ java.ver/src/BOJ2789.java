import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2789 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2789 Main = new BOJ2789();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		String a = "CAMBRIDGE";
		String b = scan.next();
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<b.length();j++) {
				if(a.charAt(i)==b.charAt(j)) {
					b= b.replace(a.charAt(i),' ');
				}
			}
		}
		System.out.print(b.replaceAll(" ", ""));
	}
}