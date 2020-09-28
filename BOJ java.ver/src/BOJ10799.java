import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10799 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		int result = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='(') {
				stack.push('(');
			}else {
				stack.pop();
				if(input.charAt(i-1)=='(') {
					result += stack.size();
				}else {
					result += 1;
				}
			}
		}
		System.out.print(result);
		
	}

}
