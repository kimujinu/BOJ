import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ5596 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ5596 Main = new BOJ5596();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		int total = 0;
		int total2 = 0;
		for(int i=0;i<array1.length;i++){
			array1[i] = scan.nextInt();
			total += array1[i];
		}
		for(int i=0;i<array1.length;i++){
			array2[i] = scan.nextInt();
			total2+=array2[i];
		}
		
		if(total<total2){
			System.out.println(total2);
		}else{
			System.out.println(total);
		}
		
		
	}
}