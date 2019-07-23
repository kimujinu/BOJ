import java.util.Scanner;

public class BOJ10039 {
Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		BOJ10039 Main = new BOJ10039();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		int total = 0;
		int array[] = new int[5];
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]<40) {
				array[i] = 40;
			}
				total += array[i];
			
		}
		System.out.printf("%d",total/5);
		
	}

}
