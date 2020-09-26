import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ10867 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeSet<Integer> set = new TreeSet<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i : set) {
			System.out.print(i+" ");
		}
		
	}

}
