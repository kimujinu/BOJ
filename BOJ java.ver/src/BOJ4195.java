import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ4195 {
	
	 public static int N;
	    public static HashMap<String, Integer> hm;
	    public static int[] parent;
	    public static int[] p_cnt;
	    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    public static void main(String[] argc) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st;

	        int T = Integer.parseInt(br.readLine());

	        for (int i = 0; i < T ; i++) {
	            hm = new HashMap<>();
	            N = Integer.parseInt(br.readLine());

	            parent = new int[N * 2];
	            p_cnt = new int[N * 2];

	            for (int j = 0; j < N * 2 ; j++) {
	                parent[j] = j;
	                p_cnt[j] = 1;
	            }

	            int cnt = 0;
	            for (int j = 0; j < N ; j++) {
	                st = new StringTokenizer(br.readLine());
	                
	                String usr1 = st.nextToken();
	                String usr2 = st.nextToken();

	                if(!hm.containsKey(usr1)){
	                    hm.put(usr1, cnt);
	                    cnt++;
	                }
	                if(!hm.containsKey(usr2)){
	                    hm.put(usr2, cnt);
	                    cnt++;
	                }
	                union(hm.get(usr1), hm.get(usr2));
	            }
	        }
	        bw.flush();
	       
	    }
	    public static int find(int now){
	        if(now == parent[now])
	            return now;

	        return parent[now] = find(parent[now]);
	    }
	    public static void union(int x, int y) throws IOException{
	        x = find(x);
	        y = find(y);

	        if(x != y){
	            parent[x] = y;
	            p_cnt[y] += p_cnt[x];
	        }
	        bw.write(p_cnt[y] + "\n");
	    }

}
