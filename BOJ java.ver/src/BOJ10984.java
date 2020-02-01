import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ10984 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ10984 main = new BOJ10984();
		main.start();
	}
	public void start() throws IOException {
		solution();
	}
	public void solution() throws IOException {
		int t = scan.nextInt();
		String[] result = new String[t];
		for(int i=0;i<t;i++) {
			int t_info = scan.nextInt();
			int total = 0;
			double total2 = 0;
			int[] c = new int[t_info];
			double[] g = new double[t_info];
			for(int j=0;j<t_info;j++) {
				c[j] = scan.nextInt();
				g[j] = scan.nextDouble();
			}
			for(int k=0;k<t_info;k++) {
				total+=c[k];
				total2+=g[k]*c[k];
			}
			result[i] = String.valueOf(total+" "+Math.round(total2*10/total)/10.0);
		}
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
	}
}
