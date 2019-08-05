import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ1427 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BOJ1427 Main = new BOJ1427();
		Main.start();
	}
	
	public void start() {
		String a = scan.next();
		solve(a);
		}
		  
		
	public void solve(String a) {
		int tmp=0;
		int i=0;
		int b = a.length();
		int array[] = new int[b];
		int n = Integer.parseInt(a);
		while(n!=0) {
			tmp = n%10;
			n/=10;
			array[i] = tmp;
			i++;
		}
		for (int j = 0; j < array.length; j++) {
            for (int k = j + 1; k < array.length; k++) {
                   if (array[j] < array[k]) {
                         int temp = array[k];
                         array[k] = array[j];
                         array[j] = temp;
                   } 
            }
     }
		
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]);
			
		}
	}

	


}
