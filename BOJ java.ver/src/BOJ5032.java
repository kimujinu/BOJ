import java.util.Scanner;

public class BOJ5032 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ5032 Main = new BOJ5032();
		Main.start();
	}
	public void start() {
		solution();
	}
	public void solution() {
		int e = scan.nextInt();
		int f = scan.nextInt();
		int c = scan.nextInt();
		int total = e + f; //ºóº´ ÇÕ°è
		int result = 0; // 
		
		while(true) {
			if(total < c) {
				break;
			}
			result += total/c;
			total = total%c + total/c;
		}
		System.out.println(result);
	}
}