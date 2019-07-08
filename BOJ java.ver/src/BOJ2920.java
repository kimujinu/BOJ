import java.util.Scanner;

public class BOJ2920 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ2920 Main = new BOJ2920();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		String result = null;
		int array[] = new int[8];
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
		}
		for(int i=0;i<array.length-1;i++) {
			if(array[i]==array[i+1]-1) {
				result ="ascending";
			}else if(array[i]==array[i+1]+1) {
				result ="descending";
			}else {
				result ="mixed";
				break;
			}
		}
		System.out.print(result);
	}
}
