import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1316 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1316 Main = new BOJ1316();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		int n = scan.nextInt();
		int result = n;
		for(int i=0;i<n;i++){
			String a = scan.next();
			boolean[] check = new boolean[26];
			
			for(int j=1;j<a.length();j++){
				if(a.charAt(j-1)!=a.charAt(j)){
					if(check[a.charAt(j)-97] == true){
						result--;
						break;
					}
					check[a.charAt(j-1)-97]=true;
				}
			}
		}
		System.out.print(result);
	}	
}