import java.util.Scanner;
import java.util.Stack;

public class BOJ3986 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BOJ3986 Main = new BOJ3986();
		Main.start();
	}
	
	public void start() {
		solve();
	}
		  
		
	public void solve() {
		int N = scan.nextInt();
		int count = 0;
		for(int i=0;i<N;i++) {
			String input = scan.next();
			Stack<Character> stack = new Stack<Character>();
			for(int j=0;j<input.length();j++) {
				if(stack.isEmpty()) {
					stack.push(input.charAt(j));
				}else if(stack.peek().equals(input.charAt(j))) {
					stack.pop();
				}else {
					stack.push(input.charAt(j));
				}
			}
			if(stack.empty()) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
