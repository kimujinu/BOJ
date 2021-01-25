import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SW_Expert_Academy_3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() throws FileNotFoundException {
		Scanner scan =new Scanner(new File("input3.txt"));
		int seq = 1;
		while(scan.hasNext()) {
			int[] array = new int[100];
			int result = 0;
			int T = scan.nextInt();
			for(int i=0;i<100;i++) {
				array[i] = scan.nextInt();
			}
			Arrays.sort(array);
			for(int i=0;i<T;i++) {
				array[0]++;
				array[99]--;
				Arrays.sort(array);
			}
			result = array[99] - array[0];
			System.out.println("#"+seq+" "+result);
			seq++;
		}
	}
}
