import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			String answer = "YES";
			
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);
				if(c=='(') {
					stack.push(c);
				}else {
					if(stack.isEmpty()) {
						answer = "NO";
					}else {
						stack.pop();
					}
				}
			}
			if(!stack.isEmpty()) {
				answer = "NO";
			}
			
			System.out.println(answer);
		}
	}

}
