import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int result = 1;
		int count = 1;
		int sum = 1;
		
		while(true) {
			sum += 6 *(count-1);
			if(sum>=N) {
				result = count;
				break;
			}
			count++;
		}
		System.out.print(result);
	}

}
