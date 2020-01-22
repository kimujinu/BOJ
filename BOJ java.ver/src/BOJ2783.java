import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2783 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	store[] store = new store[100];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2783 Main = new BOJ2783();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		store[0] = new store();
		store[0].x = scan.nextDouble();
		store[0].y = scan.nextDouble();
		double tmp = store[0].x /store[0].y;
		int n = scan.nextInt();
		double tmp2;
		for(int i=1;i<=n;i++){
			store[i] = new store();
			store[i].x = scan.nextDouble();
			store[i].y = scan.nextDouble();
			tmp2 = store[i].x /store[i].y;
			if(tmp>tmp2){
				tmp = tmp2;
			}
		}
		System.out.printf("%.2f", tmp*1000);
	}
	public class store{
		public double x;
		public double y;
	}
	
}
