import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815_ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int result = Arrays.binarySearch(array,Integer.parseInt(st2.nextToken()));
			if(result < 0) {
				System.out.print(0+" ");
			}else {
				System.out.print(1+" ");
			}
		}
		
		

	}
}
