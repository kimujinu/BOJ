import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1259 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
	     while(true) {
	    	String T = br.readLine();
	    	 if(T.equals("0")){
		    	break;
		    }else if(T.equals(new StringBuffer(T).reverse().toString())) {
	    		System.out.println("yes");
	    	}else {
	    		System.out.println("no");
	    	}
	    	
	     }
	}

}
