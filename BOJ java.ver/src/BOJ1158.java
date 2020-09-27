import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<>();
		System.out.print("<");
		for(int i=1;i<=N;i++) {
			queue.offer(i);
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<K-1;j++) {
				queue.offer(queue.poll());
			}
			System.out.print(queue.poll()+", ");
		}
		
		System.out.print(queue.poll()+">");
		
		
		
		
		
		
	}

}
