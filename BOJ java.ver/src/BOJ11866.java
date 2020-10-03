import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11866 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Queue<Integer> queue = new LinkedList<>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	StringBuilder sb = new StringBuilder();
    	sb.append("<");
    	for(int i=1;i<=N;i++) {
    		queue.add(i);
    	}
    	while(!queue.isEmpty()) {
    		for(int i=1;i<K;i++) {
    			queue.add(queue.remove());
    		}
    		sb.append(queue.remove()+", ");
    	}
    	System.out.print(sb.substring(0,sb.length()-2)+">");
	}
}
