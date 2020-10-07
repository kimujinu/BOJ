import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15649 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        solve(M,N,"");
      
	}
	
	public static void solve(int M,int N, String result) {
		if(M == 0) {
			System.out.println(result);
		}else {
			for(int i=1;i<=N;i++) {
				if(!result.contains(String.valueOf(i))) {
					solve(M-1,N,result+i+" ");
				}
			}
		}
	}

}
