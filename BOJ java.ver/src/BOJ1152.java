import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ1152 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ1152 Main = new BOJ1152();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		String n = scan.nextLine();

        StringTokenizer strToken = new StringTokenizer(n, " ");
        System.out.println(strToken.countTokens());
	}

}
