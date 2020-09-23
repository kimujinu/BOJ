import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1236 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		boolean[] col = new boolean[M];
		boolean[] row = new boolean[N];
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				if (line.charAt(j) == 'X') {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		int rCnt = 0;
		int cCnt = 0;
		for (int i = 0; i < N; i++) {
			if (!row[i]) {
				rCnt++;
			}
		}
		for (int i = 0; i < M; i++) {
			if (!col[i]) {
				cCnt++;
			}
		}

		System.out.println(cCnt > rCnt ? cCnt : rCnt);
	}

}
