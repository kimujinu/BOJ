import java.util.Scanner;

public class BOJ2562 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ2562 Main = new BOJ2562();
		Main.start();
	}
	
	public void start() {
		
		solve();
		}
		  
	public void solve() {
		int tmp2=0;
		int array[] = new int[10];
		for(int i=1;i<=9;i++) {
			array[i] = scan.nextInt();
		}
		int max = array[1];
		for(int i=1;i<=9;i++) {
			if(max<=array[i]) {
				max = array[i];
				tmp2 = i;
			}
		}
		System.out.println(max);
		System.out.print(tmp2);
		
	}

}
