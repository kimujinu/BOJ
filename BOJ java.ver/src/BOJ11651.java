import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ11651 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ11651 Main = new BOJ11651();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		int n = scan.nextInt();
		sorting[] sort = new sorting[n];
		
		for(int i=0;i<n;i++){
			int x = scan.nextInt();
			int y = scan.nextInt();
			sort[i] = new sorting(x,y);
		}
		Arrays.sort(sort);
		for(int i=0;i<n;i++){
			System.out.print(sort[i].x+" "+sort[i].y);
			System.out.println();
		}
		
	}
	public class sorting implements Comparable<sorting>{
		public int x;
		public int y;
		
		public sorting(int x,int y){
			this.x =x;
			this.y =y;
		}
		@Override
		public int compareTo(sorting o) {
			// TODO Auto-generated method stub
			int cy = y - o.y;
			
			return (cy!=0) ? cy:x - o.x;
		}
	}
}