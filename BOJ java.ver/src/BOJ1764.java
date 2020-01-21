import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1764 {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1764 Main = new BOJ1764();
		Main.start();
	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int n = scan.nextInt(); 
		int m = scan.nextInt();
		int count = 0;
		int max = Math.max(n, m);
		String[] name1 = new String[n];
		String[] name2 = new String[m];
		String[] result = new String[max];
		for(int i=0;i<n;i++){
			name1[i] = scan.next();
		}
		for(int i=0;i<m;i++){
			name2[i] = scan.next();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(name1[i].equals(name2[j])){
					result[count] = name1[i];
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<result.length;i++){
			if(result[i]!=null){
				System.out.println(result[i]);
			}
		}
	}
}