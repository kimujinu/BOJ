import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int S = 0;
		int[] array1 = new int[N];
		int[] array2 = new int[N];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			array1[i] = Integer.parseInt(st1.nextToken());
			array2[i] = Integer.parseInt(st2.nextToken());
		}
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		for(int i=0;i<N;i++) {
			S+= array1[i] * array2[N-1-i];
		}
		System.out.println(S);
	}

}
