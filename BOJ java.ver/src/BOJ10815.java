import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
	static int[] array;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		array = new int[N];
		for(int i=0;i<N;i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int result = BinarySearch(Integer.parseInt(st2.nextToken()));
			if(result != -1) {
				System.out.print(1+" ");
			}else {
				System.out.print(0+" ");
			}
		}
		
		
		
	}
	
	private static int BinarySearch(int target){
		int left = 0;
		int right = array.length - 1;
		int mid;

		while(left <= right){
			mid = (left + right) / 2;
			if(array[mid] < target)
				left = mid + 1;
			else if(array[mid] > target)
				right = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
