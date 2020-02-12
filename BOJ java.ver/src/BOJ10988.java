import java.util.Scanner;

public class BOJ10988 {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ10988 Main = new BOJ10988();
		Main.start();
	}
	public void start() {
		solve();
	}
	public void solve() {
		String input = scan.next();
		String result = "";
		for(int i=input.length()-1;i>=0;i--) {
			result += input.charAt(i);
		}
		
		if(input.equals(result)) {
			System.out.print(1);
		}else {
			System.out.print(0);
		}
	}

}
