import java.util.Scanner;

public class BOJ2857 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	
	public static void main(String[] args) {
		BOJ2857 Main = new BOJ2857();
		Main.start();
	}
	
	public void start() {
	
		solve();
		}
		  
		
	public void solve() {
		String[] a = new String[5];
		int count = 0;
		for(int i=0;i<5;i++) {
			a[i] = scan.next();
		}
		for(int i=0;i<5;i++) {
			if(a[i].indexOf("FBI")!=-1) {
				count++;
				System.out.print(i+1+" ");
			}
		}
		if(count==0) {
			System.out.print("HE GOT AWAY!");
		}
//		String[] a = new String[6];
//		int count = 0;
//		for(int i=1;i<=5;i++) {
//			a[i] = scan.next();
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<a[i].length()-1;j++) {
//				if(a[i].charAt(j-1)=='F' && a[i].charAt(j)=='B' && a[i].charAt(j+1)=='I') {
//					count++;
//					System.out.print(i+" ");
//				}
//			}
//		}
//		if(count==0) {
//			System.out.print("HE GOT AWAY!");
//		}
	}

}
