import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int count = 0;
    	int K = 1;
    	
    	while(N!=0) {
    		if(K>N) {
    			K=1;
    		}
    		N-=K;
    		K+=1;
    		count+=1;
    	}
    	
    	System.out.println(count);
	}

}
