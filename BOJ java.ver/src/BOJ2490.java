import java.util.Scanner;

public class BOJ2490 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BOJ2490 Main = new BOJ2490();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		int count=0;
		int array[] = new int[4];
		for(int j=0;j<3;j++) {
		for(int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
			if(array[i]==1) {
				count++;
			}
		}
		switch(count) {
		case 0:
			System.out.println("D");
			break;
		case 1:
			System.out.println("C");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("A");
			break;
		case 4:
			System.out.println("E");
			break;
		}
		count=0;
		
	  }
	}
}
