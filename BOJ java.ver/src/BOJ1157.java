import java.util.Scanner;

public class BOJ1157 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ1157 Main = new BOJ1157();
		Main.start();
	}
	
	public void start() {
		
		solve();
	}
	
	public void solve() {
		char result = '?';
		int[] cnt = new int[26];
		int count = 0;
		String a = scan.next().toUpperCase();
		for(int i=0;i<a.length();i++) {
			cnt[a.charAt(i)-65]++;
			if(count < cnt[a.charAt(i)-65]) {
				result = a.charAt(i);
				count = cnt[a.charAt(i)-65];
			}
			else if(count == cnt[a.charAt(i)-65])
				result = '?';
		}
		
		System.out.print(result);
	}
	
	
	

}
