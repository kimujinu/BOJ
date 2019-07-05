
import java.util.Scanner;

public class BOJ1138 {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	int count=0;


	public static void main(String[] args) {
		BOJ1138 Main = new BOJ1138();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
		
	public void solve(int n) {
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			count = scan.nextInt();
			for(int j=0;j<n;j++) {
				if(count==0 && array[j]==0) {
					array[j]= i+1;
					break;
				}else if(array[j]==0) {
					count--;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
		
		
	}
}
