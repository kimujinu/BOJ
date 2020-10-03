import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];
		while(T-->0) {
			int N = Integer.parseInt(br.readLine());
			int[] array = new int[N+1];
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				array[x] = y;
			}
			
			int count = 1;
			int pivot = array[1];
			for(int i=2;i<=N;i++) {
				if(pivot>array[i]) {
					count++;
					pivot = array[i];
				}
			}
			System.out.println(count);
		}
	}

}
