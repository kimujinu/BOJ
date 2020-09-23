import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1543 {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    	String doc = br.readLine();
    	String findsb = br.readLine();
    	int count = 0;
    	for(int i=0;i<doc.length()-findsb.length()+1;i++) {
    		String temp = doc.substring(i,i+findsb.length());
    		if(temp.equals(findsb)) {
    			count++;
    			i+=findsb.length();
    			i--;
    		}
    	}
    	System.out.println(count);
    }
}
