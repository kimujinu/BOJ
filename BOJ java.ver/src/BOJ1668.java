import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1668 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N];
		int L_count = 1;
		int R_count = 1;
		int j=0;
		int k=array.length-1;
		for(int i=0;i<array.length;i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[j]<array[i]) {
				L_count++;
				j=i;
			}
		}
		
		for(int i=array.length-1;i>=0;i--) {
			if(array[k]<array[i]) {
				R_count++;
				k=i;
			}
		}
		System.out.println(L_count);
		System.out.println(R_count);
		
	}

}
