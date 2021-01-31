import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SW_Expert_Academy_4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		solve();
	}
	public static void solve() throws FileNotFoundException {
		Scanner scan =new Scanner(new File("input4.txt"));
		for(int TC=1;TC<=10;TC++) {
			int T = scan.nextInt();
			int array[][] = new int[100][100];
			int tempmax = 0;
			int max = 0;
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					array[i][j] = scan.nextInt(); 
				}
			}
			for(int i=0;i<100;i++) {
				tempmax = 0;
				for(int j=0;j<100;j++) {
					tempmax += array[i][j];
				}
				if(max<=tempmax) {
					max = tempmax;
				}
			}
			tempmax = 0;
			for(int i=0;i<100;i++) {
				tempmax = 0;
				for(int j=0;j<100;j++) {
					tempmax += array[j][i];
				}
				if(max<=tempmax) {
					max = tempmax;
				}
			}
			tempmax = 0;
			for(int i=0;i<100;i++) {
				tempmax += array[i][i];
				if(max<=tempmax) {
					max = tempmax;
				}
			}
			tempmax = 0;
			for(int i=99,j=0;i>=0;i--,j++) {
				tempmax += array[j][i];
			}
			if(max<=tempmax) {
				max = tempmax;
			}
			
			System.out.println("#"+TC+" "+max);
		}
	}
}
