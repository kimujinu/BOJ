import java.util.Scanner;

public class BOJ10818 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ10818 Main = new BOJ10818();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
	public void solve(int n) {
		int array[] = new int[n];
		int max = 0;
		int min = 0;
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
		}
		int tmp = array[0];
		int tmp2 =array[0];
		for(int i=0;i<n;i++) {
			max = Math.max(array[i], tmp);
			tmp = max;
			min = Math.min(array[i], tmp2);
			tmp2 = min;
		}
		System.out.println(min);
		System.out.println(max);
	}
}
