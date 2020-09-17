import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		String ASet = br.readLine();
		
		StringTokenizer A_token = new StringTokenizer(ASet);
		int count = A_token.countTokens();
		
		for(int i=0;i<count;i++) {
			A[i] = Integer.parseInt(A_token.nextToken());
		}
		
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		
		ASet = br.readLine();
		A_token = new StringTokenizer(ASet);
		count = A_token.countTokens();
		for(int i=0;i<count;i++) {
			int index = Arrays.binarySearch(A, Integer.parseInt(A_token.nextToken()));
			
			if(index < 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
		
	}

}
