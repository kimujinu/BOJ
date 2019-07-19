import java.util.Scanner;

public class BOJ7568 {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	
	public static void main(String[] args) {
		BOJ7568 Main = new BOJ7568();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
		
	public void solve(int n) {
		int[] weight = new int[n];
		int[] height = new int[n];
		for(int i=0;i<n;i++) {
			weight[i] = scan.nextInt();
			height[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			count = 1;
			for(int j=0;j<n;j++) {
				if(weight[i]< weight[j] && height[i]< height[j]) {
					count++;
				}
			}
			System.out.print(count+" ");
		}
		
	}

}
