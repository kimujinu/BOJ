import java.util.Scanner;

public class BOJ10797 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ10797 Main = new BOJ10797();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
	public void solve(int n) {
		int array[] = new int[5];
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
			if(array[i]==n) {
				count++;
			}
		}
		System.out.print(count);
		
	}
}
