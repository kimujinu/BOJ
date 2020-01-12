import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ4948 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ4948 Main = new BOJ4948();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int m=1;
		while(true) {
			m=scan.nextInt();
			if (m==0) {
				break;
			}
			int n=m*2;
			int cnt=0;
			boolean[] data= new boolean[n+1];
			
			data[0]=false;
			data[1]=false;
			for(int i=2;i<=n;i++) {
				data[i]=true;
			}
			for(int i=2;i<=n;i++) { 
				for(int j=2;j*i<=n;j++) { 
					data[i*j]=false;
				}
			}
			for(int i=m+1;i<data.length;i++) {
				if (data[i]) {
					cnt++;
				}
			}
			System.out.println(cnt);
			
		}
			
		}
}

