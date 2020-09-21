import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		
		for(int i=0;i<N;i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(array);
		for(int i =0;i<N;i++) {
			sb.append(array[i]).append("\n");
		}
		
		System.out.println(sb);
	}

}
