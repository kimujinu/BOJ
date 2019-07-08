import java.util.Scanner;

public class BOJ2577 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		BOJ2577 Main = new BOJ2577();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		solve(a,b,c);
		}
		  
		
	public void solve(int a,int b,int c) {
		int array[] = new int[10];
		int total = a*b*c;
		int result = 0;
		while(total !=0) {
			result = total % 10;
			total/=10;
			if(result==0) {
				array[0]++;
			}else if(result ==1) {
				array[1]++;
			}else if(result ==2) {
				array[2]++;
			}else if(result ==3) {
				array[3]++;
			}else if(result ==4) {
				array[4]++;
			}else if(result ==5) {
				array[5]++;
			}else if(result ==6) {
				array[6]++;
			}else if(result ==7) {
				array[7]++;
			}else if(result ==8) {
				array[8]++;
			}else if(result ==9) {
				array[9]++;
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}


}
