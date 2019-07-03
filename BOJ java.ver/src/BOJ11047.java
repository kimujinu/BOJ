import java.util.Scanner;

public class BOJ11047 {

	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ11047 Main = new BOJ11047();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		int k = scan.nextInt();
		solve(n,k);
		}
		  
	public void solve(int n,int k) {
		int array[] = new int[n+1];
		for(int i=1;i<=n;i++) {
			array[i] = scan.nextInt();
		}
		while(k>0) {
		for(int j=n;j>0;j--) {
			if(k>=array[j]) {
				k = k-array[j];
				count++;
				break;
			}
		 }
		}
		System.out.print(count);
		
	}

}
