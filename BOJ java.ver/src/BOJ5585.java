import java.util.Scanner;

public class BOJ5585 {

	Scanner scan = new Scanner(System.in);
	int array[] = new int[6];
	
	int count=0;
	
	public static void main(String[] args) {
		BOJ5585 Main = new BOJ5585();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		solve(a);
		}
		  
		
	public void solve(int n) {
		int tmp = 1000-n;
		array[0] = 1;
		array[1] = 5;
		array[2] = 10;
		array[3] = 50;
		array[4] = 100;
		array[5] = 500;
		while(tmp>0) {
			for(int i=5;i>=0;i--) {
				if(tmp>=array[i]) {
					tmp = tmp - array[i];
					count++;
					break;
				}
			}
		}
		System.out.print(count);
	}
}
