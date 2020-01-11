import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ2822 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ2822 Main = new BOJ2822();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		int array[] = new int[8];
		int array2[] = new int[5];
		int array3[] = new int[8];
		int total = 0;
		int count = 0;
		for(int i=0;i<array.length;i++){
			array[i] = scan.nextInt();
		}
		for(int i=0;i<array.length;i++){
			array3[i] = array[i];
		}
		Arrays.sort(array3);
		for(int i=3;i<array3.length;i++){
			total+=array3[i];
			array2[count] = array3[i];
			count++;
		}
		System.out.println(total);
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array2.length;j++){
				if(array2[j]==array[i]){
					System.out.print(i+1+" ");
				}
			}
		}
	}
}