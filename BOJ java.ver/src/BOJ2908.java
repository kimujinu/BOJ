import java.util.Scanner;

public class BOJ2908 {
	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ2908 Main = new BOJ2908();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		solve(a,b);
		}
		  
	public void solve(int a,int b) {
		String result1 = "";
		String result2 = "";
		int tmp=0;
		int tmp2 =0;
		while(a!=0) {
			tmp = a%10;
			result1 += Integer.toString(tmp);
			a/=10;
		}
		while(b!=0) {
			tmp2 = b%10;
			result2 += Integer.toString(tmp2);
			b/=10;
		}
		if(Integer.parseInt(result1)>Integer.parseInt(result2)) {
			System.out.print(result1);
		}else {
			System.out.print(result2);
		}
		
	}

}
