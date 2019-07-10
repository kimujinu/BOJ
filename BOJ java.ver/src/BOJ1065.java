import java.util.Scanner;

public class BOJ1065 {

	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ1065 Main = new BOJ1065();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		solve(n);
		}
		  
	public void solve(int n) {
		int array[] = new int[3];
		int i=0;
		if(0<n && n<100) {
			System.out.print(n);
		}else{
		for(int j=100;j<=n;j++) {
			i=0; int num = j;
			while(num!=0) {
				array[i] = num %10;
				num/=10;
				i++;
			}
			if(array[0]-array[1]==array[1]-array[2]) {
				count++;
			}
			}
		System.out.print(99+count);
		}
	}
}
