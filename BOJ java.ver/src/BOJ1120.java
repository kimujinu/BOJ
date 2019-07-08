import java.util.Scanner;

public class BOJ1120 {
	Scanner scan = new Scanner(System.in);
	int tmp =0;
	
	public static void main(String[] args) {
		BOJ1120 Main = new BOJ1120();
		Main.start();
	}
	
	public void start() {
		String a = scan.next();
		String b = scan.next();
		solve(a,b);
		}
		  
		
	public void solve(String a,String b) {
		for(int i=0;i<=b.length()-a.length();i++) {
			int count=0;
			for(int j=i;j<i+a.length();j++) {
				if(a.charAt(j-i)==b.charAt(j)) {
					count++;
				}
				if(count>tmp) {
					tmp = count;
				}
			}
			
		}
		tmp+=(b.length()-a.length());
		System.out.print(b.length()-tmp);
	}

}
