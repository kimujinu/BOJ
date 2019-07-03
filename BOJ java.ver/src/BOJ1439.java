import java.util.Scanner;

public class BOJ1439 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	int zero=0;
	int one=0;
	
	public static void main(String[] args) {
		BOJ1439 Main = new BOJ1439();
		Main.start();
	}
	
	public void start() {
		String n = scan.next();
		solve(n);
		}
		  
		
	public void solve(String n) {
		if(n.charAt(0)=='0') {
			zero = 1;
		}else {
			one = 1;
		}
		
		for(int j=1;j<n.length();j++) {
			if(n.charAt(j) != n.charAt(j-1)) {
				if(n.charAt(j)=='0') {
					zero++;
				}else {
					one++;
				}
			}
		}
		
		if(zero>one) {
			System.out.print(one);
		}else {
			System.out.print(zero);
		}
		
	}

}
