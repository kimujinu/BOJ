import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ10816 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int temp = Integer.parseInt(st.nextToken());
			if(!map.containsKey(temp)) {
				map.put(temp, 1);
			}else {
				map.put(temp, map.get(temp)+1);
			}
		}
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int temp = Integer.parseInt(st2.nextToken());
			if(!map.containsKey(temp)) {
				sb.append(0+" ");
			}else {
				sb.append(map.get(temp)+" ");
			}
		}
		System.out.println(sb);
	}

}
