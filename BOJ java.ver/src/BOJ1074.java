import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1074 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		int x = (int)Math.pow(2, N)/2;
		int y = (int)Math.pow(2, N)/2;
		while(N-->0) {
			int temp = (int)Math.pow(2, N)/2;
			int skip = (int)Math.pow(4, N);
			if(r<y&&c<x) {
				x-=temp;
				y-=temp;
			}else if(r<y&&c>=x) {
				x+=temp;
				y-=temp;
				ans+=skip;
			}else if(r>=y&&c<x) {
				x-=temp;
				y+=temp;
				ans+=skip*2;
			}else {
				x+=temp;
				y+=temp;
				ans+=skip*3;
			}
		}
		System.out.println(ans);
		
	}

}
