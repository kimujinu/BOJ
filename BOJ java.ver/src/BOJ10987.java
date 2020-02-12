import java.util.Scanner;

public class BOJ10987 {
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ10987 Main = new BOJ10987();
		Main.start();
	}
	public void start() {
		solve();
	}
	public void solve() {
		String input = scan.next();
		int count=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'|| input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
				count++;
			}
		}
		System.out.print(count);
	}

}
