import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2217 {
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ2217 main = new BOJ2217();
		main.start();
	}
	public void start() {
		solution();
	}
	public void solution() {
		int n = scan.nextInt();
		Integer[] array = new Integer[n];
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array, Collections.reverseOrder());
		int max = 0;
		int count = 1;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]*count) {
				max = array[i]*count;
			}
			count++;
		}
		System.out.println(max);
	}

}
