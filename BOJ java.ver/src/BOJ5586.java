import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class BOJ5586 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ5586 Main = new BOJ5586();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		String a = in.readLine();
		int JOIcount =0;
		int IOIcount =0;
		for(int i=1;i<a.length()-1;i++){
			if(a.charAt(i-1)=='J' && a.charAt(i)=='O' && a.charAt(i+1)=='I'){
				JOIcount++;
			}
			if(a.charAt(i-1)=='I' && a.charAt(i)=='O' && a.charAt(i+1)=='I'){
				IOIcount++;
			}
		}
		System.out.printf("%d\n%d",JOIcount,IOIcount);
		
	}	
}