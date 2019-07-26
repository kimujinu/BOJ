import java.util.Scanner;

public class BOJ10798 {
	Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		BOJ10798 Main = new BOJ10798();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		String array[]= new String[5];
		for(int i=0;i<5;i++) {
				array[i] = scan.next();
		}
		for(int i=0;i<15;i++) {
			for(int j=0;i<5;j++) {
				if(i<array[j].length()) {
					System.out.print(array[j].charAt(i));
				}
			}
		}
		}
	

}
