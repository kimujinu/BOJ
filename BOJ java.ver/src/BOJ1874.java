import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		
		int temp = 1;
		int n = Integer.parseInt(br.readLine());
		boolean able = true;
		StringBuilder sb = new StringBuilder();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++) {
			array[i] = Integer.parseInt(br.readLine());
			
			if(able) {
				if(temp <= array[i]) {
					while(temp<=array[i]) {
						stack.push(temp++);
						sb.append("+\n");
					}
				}
			}
			if(stack.isEmpty()) {
				able = false;
			}
			else {
				while(stack.peek()>=array[i]) {
					stack.pop();
					sb.append("-\n");
					if(stack.isEmpty()) {
						break;
					}
				}
			}
		}
		if(able) {
			System.out.println(sb.toString());
		}else {
			System.out.println("NO");
		}
		
		
		
		
	}

}
