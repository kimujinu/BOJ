import java.util.Scanner;

public class BOJ8958 {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	int o =0;
	
	
	public static void main(String[] args) {
		BOJ8958 Main = new BOJ8958();
		Main.start();
	}
	
	public void start() {
		int a = scan.nextInt();
		solve(a);
		}
		  
		
	public void solve(int n) {
		int result[] = new int[n];
		String problem[]=new String[n];
		for(int i=0;i<n;i++) {
			problem[i]=scan.next();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<problem[i].length();j++) {
				if(problem[i].charAt(j)=='O'){
				    o++;
					count += o;
			  }else if(problem[i].charAt(j)=='X'){
				     o=0;
			  }
		 }
		result[i] = count;	
		count = 0;
		o=0;
	  }
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
