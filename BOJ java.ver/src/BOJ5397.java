import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ5397 {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = in.read();
		
		
		for(int i=0;i<n;i++) {
			Stack<Character> L_stack = new Stack<>();
			Stack<Character> R_stack = new Stack<>();
			StringBuilder result = new StringBuilder();
			
			String L = in.readLine();

			for(int j=0;j<L.length();j++) {
				if(L.charAt(j)=='-') {
					if(!L_stack.isEmpty()) {
						L_stack.pop();
					}
				}else if(L.charAt(j)=='<') {
					if(!L_stack.isEmpty()) {
						R_stack.push(L_stack.pop());
					}
				}else if(L.charAt(j)=='>') {
					if(!R_stack.isEmpty()) {
						L_stack.push(R_stack.pop());
					}
				}else {
					L_stack.push(L.charAt(j));
				}
			}
				
				while(!R_stack.isEmpty()) {
					L_stack.push(R_stack.pop());
				}
				
				while(!L_stack.isEmpty()) {
					result.append(L_stack.pop());
				}
				
				System.out.println(result.reverse());

			}
			
		}
	}


