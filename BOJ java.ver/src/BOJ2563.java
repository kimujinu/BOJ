import java.util.Scanner;

public class BOJ2563 {

	Scanner scan = new Scanner(System.in);
	int count=0;

	public static void main(String[] args) {
		BOJ2563 Main = new BOJ2563();
		Main.start();
	}
	
	public void start() {
		solve();
	}
		  
	public void solve() {
		 int n = scan.nextInt();
	     int[][] map = new int[100][100];
	     int cnt = 0;
	    	
	     for(int i = 0; i < n; i++) {
	            int x = scan.nextInt();
	            int y = scan.nextInt();
	            for(int j = x; j < x + 10; j++) {
	                for(int k = y; k < y + 10; k++) {
	                    if(map[j][k] == 1)
	                        continue;
	                    map[j][k] = 1;
	                    ++cnt;
	                }
	            }
	        }
	        System.out.println(cnt);
	}
	}

