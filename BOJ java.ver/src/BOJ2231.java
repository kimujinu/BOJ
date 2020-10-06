import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	
    	int answer=0;
		int sum=0;
		
		for(int i=1;i<N;i++) {
			int num=i;
			sum=num;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			if(sum==N) {
				answer=i;
				break;
			}
		}
		
		System.out.println(answer);
	}

}
