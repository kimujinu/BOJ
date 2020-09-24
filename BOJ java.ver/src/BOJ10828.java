import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}else if(str.equals("pop")) {
				if(stack.size()<1) {
					System.out.println("-1");
				}else {
					int result = stack.pop();
					System.out.println(result);
				}
			}else if(str.equals("size")) {
				System.out.println(stack.size());
			}else if(str.equals("empty")) {
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(str.equals("top")) {
				if(stack.size()<1) {
					System.out.println(-1);
				}else {
					int result = stack.peek();
					System.out.println(result);
				}
			}
		}
		
	}
	
}
