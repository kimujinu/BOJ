import java.util.Scanner;

public class BOJ5543 {

	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ5543 Main = new BOJ5543();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		solve(a,b,c,d,e);
		}
		  
	public void solve(int a,int b,int c,int d,int e) {
		int beverage = 0;
		int food = 0;
		int total = 0;
		beverage = (d<e)? d:e;
		food = (a<b)&&(a<c)?a:(c<b?c:b);
		
		total = beverage + food;
		System.out.print(total-50);
	}
}
