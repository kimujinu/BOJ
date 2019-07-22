import java.util.Arrays;
import java.util.Scanner;

public class BOJ2750 {
	Scanner scan = new Scanner(System.in);
	int tmp=0;
	
	public static void main(String[] args) {
		BOJ2750 Main = new BOJ2750();
		Main.start();
	}
	
	public void start() {
		int t = scan.nextInt();
		solve(t);
		}
	public void solve(int t) {
		BubbleSort(t);
		InsertionSort(t);
	}
		  
	public void BubbleSort(int t) {
		int array[] = new int[t];
		for(int i =0;i<t;i++) {
			array[i] = scan.nextInt(); 
		}
		for(int i=0;i<t;i++) {
			for(int j=0;j<t-1-i;j++) {
				if(array[j]>array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		for(int i=0;i<t;i++)
			System.out.println(array[i]);
	}
	
	public void InsertionSort(int t){
		int array[] = new int[t];
		for(int i=0;i<t;i++) {
			array[i] = scan.nextInt();
		}
		int a,j;
		for(int i=1;i<t;i++) {
			a = array[i];
			for(j=i-1;j>=0 && array[j]>a;j--) {
				array[j+1] = array[j];
			}
			array[j+1] = a;
		}
		for(int i=0;i<t;i++) {
			System.out.println(array[i]);
		}
	} 
}
