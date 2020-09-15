import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ1966 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(101, Comparator.reverseOrder());
			LinkedList<Doc> q = new LinkedList<Doc>();
			for(int i=0; i<N; i++) {
				int priority = sc.nextInt();
				q.add(new Doc(priority, i));
				pq.add(priority);
			}
			int cnt = 0;
			while(!pq.isEmpty()) {
				Doc cur = q.poll();
				int max = pq.poll();
				if(cur.priority != max) {
					q.add(cur);
					pq.add(max);
					continue;
				} else {
					cnt++;
				}
				if(cur.id == M) break;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}

class Doc{
	int priority, id;
	Doc(int p, int id){
		this.priority = p;
		this.id = id;
	}
}