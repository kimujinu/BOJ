import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ10814 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ10814 Main = new BOJ10814();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n= scan.nextInt();
		String arr[][]=new String[n][2]; 
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = scan.next();			
			}	
		}
		Arrays.sort(arr,new Comparator<String[]>() { 
			@Override
			public int compare(String[] o1,String[] o2) {							
					return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}	
		});
		for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		}
	}
