import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ1541 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1541 main = new BOJ1541();
		main.start();
	}
	public void start() throws IOException {
		solution();
	}
	public void solution() throws IOException {
		String a = in.readLine();
		String[] base = a.split("\\-");
		
		int min = 0;
		for(int i=0;i<base.length;i++) {
			String[] base2 = base[i].split("\\+");
			int total = 0;
			for(String tmp : base2) {
				total += Integer.parseInt(tmp);
			}
			if(i==0) {
				total *=-1;
			}
			min -= total;
			}
			System.out.println(min);
	}

}
