import java.util.Scanner;



public class BOJ10953 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ10953 Main = new BOJ10953();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		 int n = scan.nextInt();
	        for(int i=0;i<n;i++){
	            String[] arr = scan.next().split(",");
	            System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[1]));
	        }
	    }

}
