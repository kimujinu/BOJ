import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ7490 {
	 private static int N = 0;
	    public static void main(String[] args) throws Exception, Exception {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int tc = Integer.parseInt(br.readLine());

	        for(int i = 0; i<tc; i++){
	            N = Integer.parseInt(br.readLine());
	            String c = "1";
	            recursive(1, 0,1, 1, c);
	            System.out.println();
	        }
	    }

	    public static void recursive(int cur, int val, int sign, int num, String c){
	        if(cur == N) {
	            val += (num * sign);
	            if (val == 0) {
	                System.out.println(c);
	            }
	        } else {
	            // 공백 일 경우
	            recursive(cur + 1, val, sign, num*10 + (cur + 1), c + " " + Integer.toString(cur+1));
	            // + 할 경우
	            recursive(cur + 1, val + (sign * num), 1, cur + 1, c + "+" + Integer.toString(cur+1));
	            // - 할 경우
	            recursive(cur + 1, val + (sign * num), -1, cur + 1, c + "-" + Integer.toString(cur+1));
	        }
	    }

}
