import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			if(queue.size()==1) {
				System.out.print(queue.peek());
				break;
			}
			queue.remove();
			queue.add(queue.remove());
			
		}
	}

}
