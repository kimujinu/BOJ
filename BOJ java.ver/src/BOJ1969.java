import java.util.Scanner;

public class BOJ1969 {
	Scanner scan = new Scanner(System.in);
	int totaldistance=0;
	
	
	public static void main(String[] args) {
		BOJ1969 Main = new BOJ1969();
		Main.start();
	}
	
	public void start() {
		int n = scan.nextInt();
		int m = scan.nextInt();
		solve(n,m);
		}
		  
	public void solve(int n,int m) {
		int max=0;
		String[] DNA = new String[n];
		for(int i=0;i<n;i++) {
			DNA[i] = scan.next();
		}
		for(int j=0;j<m;j++) {
			int a=0,t = 0,g=0,c=0;
			for(int k=0;k<n;k++) {
				if(DNA[k].charAt(j)=='A') {
					a++;
				}else if(DNA[k].charAt(j)=='T') {
					t++;
				}else if(DNA[k].charAt(j)=='G') {
					g++;
				}else if(DNA[k].charAt(j)=='C') {
					c++;
				}
			}
			max = Math.max(a>t?a:t,g>c?g:c);
			totaldistance += (n-max);
			if(max==a) {
				System.out.print("A");
			}else if(max==t) {
				System.out.print("T");
			}else if(max==g) {
				System.out.print("G");
			}else {
				System.out.print("C");
			}
			
		}
		System.out.println();
		System.out.print(totaldistance);
		
	}

}
