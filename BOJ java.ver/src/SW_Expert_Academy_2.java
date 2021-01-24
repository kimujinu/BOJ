import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SW_Expert_Academy_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() throws FileNotFoundException {
		Scanner scan =new Scanner(new File("input2.txt"));
		
		int seq = 0;
		while(scan.hasNext()) {
			seq ++;
			int count = 0;
			int T = scan.nextInt();
			int[] array = new int[T];
			
			for(int i=0;i<T;i++) {
				array[i] = scan.nextInt();
			}
			
			for(int i=2;i<T-2;i++) {
				Integer[] temp = new Integer[4];
				temp[0] = array[i] - array[i-2];
				temp[1] = array[i] - array[i-1];
				temp[2] = array[i] - array[i+1];
				temp[3] = array[i] - array[i+2];
				
				if(temp[0]<0 || temp[1]<0 || temp[2]<0 || temp[3]<0) continue;
				else {
					Arrays.sort(temp);
					count = count + temp[0];
				}
			}
			
			System.out.println("#"+seq+" "+count);
		}
	}

}
