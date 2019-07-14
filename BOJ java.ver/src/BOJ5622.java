import java.util.Scanner;

public class BOJ5622 {
	Scanner scan = new Scanner(System.in);
	int count=0;
	
	public static void main(String[] args) {
		BOJ5622 Main = new BOJ5622();
		Main.start();
	}
	
	public void start() {
		String a = scan.next();
		solve(a);
		}
		  
		
	public void solve(String n) {
	for(int i=0;i<n.length();i++) {
		if(n.charAt(i)==' ') {
			count += 2;
		}else if(n.charAt(i)=='A' || n.charAt(i)=='B'|| n.charAt(i)=='C' ) {
			count += 3;
		}else if(n.charAt(i)=='D' || n.charAt(i)=='E'|| n.charAt(i)=='F' ) {
			count += 4;
		}else if(n.charAt(i)=='G' || n.charAt(i)=='H'|| n.charAt(i)=='I' ) {
			count += 5;
		}else if(n.charAt(i)=='J' || n.charAt(i)=='K'|| n.charAt(i)=='L' ) {
			count += 6;
		}else if(n.charAt(i)=='M' || n.charAt(i)=='N'|| n.charAt(i)=='O' ) {
			count += 7;
		}else if(n.charAt(i)=='P' || n.charAt(i)=='Q'|| n.charAt(i)=='R' || n.charAt(i)=='S' ) {
			count += 8;
		}else if(n.charAt(i)=='T' || n.charAt(i)=='U'|| n.charAt(i)=='V' ) {
			count += 9;
		}else if(n.charAt(i)=='W' || n.charAt(i)=='X'|| n.charAt(i)=='Y' || n.charAt(i)=='Z') {
			count += 10;
		}else {
			count += 11;
		}
		
	}
	System.out.print(count);
  }
}
