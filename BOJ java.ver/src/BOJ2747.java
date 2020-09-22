import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2747 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 1;
		int result = 1;
	
			for(int i=2;i<=n;i++) {
				result = a+b;
				a=b;
				b=result;
			}
		
		System.out.println(result);
	}

}
