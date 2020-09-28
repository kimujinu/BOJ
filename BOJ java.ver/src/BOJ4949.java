import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
				
		while(true) {
			stack.clear();
			String input = br.readLine();
			if(input.equals(".")) {
				break;
			}
			for(int i=0;i<input.length();i++) {
			  char c = input.charAt(i);
			  if(c=='(' || c=='[') {
				  stack.push(c);
			  }else if(c==')') {
				  if(stack.isEmpty() || stack.peek().equals('[')) {
					  stack.push(c);
					  break;
				  }
				  stack.pop();
			  }else if(c==']') {
				  if(stack.isEmpty() || stack.peek().equals('(')) {
					  stack.push(c);
					  break;
				  }
				  stack.pop();
			  }
			}
			if(stack.isEmpty()) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
		
	}

}
