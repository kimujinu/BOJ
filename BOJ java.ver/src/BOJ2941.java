import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ2941 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2941 Main = new BOJ2941();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		String input = scan.nextLine();
        String match[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        for(int i=0;i<match.length;i++){
        	input = input.replace(match[i],"a");
        }
        System.out.println(input.length());
	}
	}
