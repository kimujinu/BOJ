import java.util.Arrays;
import java.util.Scanner;

public class BOJ2751 {
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		BOJ2751 Main = new BOJ2751();
		Main.start();
	}
	
	public void start() {
		int t = scan.nextInt();
		solve(t);
		}
		  
	public void solve(int t) {
		HeapSort(t);
	}
	
	public void HeapSort(int t) {
		int array[] = new int[t];
		for(int i=0;i<t;i++) {
			array[i] = scan.nextInt();
		}
		for(int i=1;i<t;i++) {
			int child = i;
			while(child>0) {
				int parent = (child-1)/2;
				if(array[child]>array[parent]) {
					int tmp = array[parent];
					array[parent] = array[child];
					array[child] = tmp;
				}
				child = parent;
			}	while(child != 0);
		}
		for(int i=t-1;i>=0;i--) {
			int tmp = array[0];
			array[0] = array[i];
			array[i] = tmp;
			int root =0;
			int child =1;
			do {
				child = 2 * root +1;
				if(child < i-1 && array[child]<array[child+1]) {
					child++;
				}
			
			if(child <i && array[root]<array[child]) {
				tmp = array[root];
				array[root] = array[child];
				array[child] = tmp;
			}
			root = child;
		}while(child<i);
		}
		for(int i=0;i<t;i++) {
			System.out.println(array[i]);
		}
	}
	
}
