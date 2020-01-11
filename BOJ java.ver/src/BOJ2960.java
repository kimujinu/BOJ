import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2960 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2960 Main = new BOJ2960();
		Main.start();

	}
	public void start() throws IOException{
		solve();
	}
	public void solve() throws IOException {
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] array = new int[n];
		int[] temp = new int[n];
		int tmp = 0;
		int count = 0;
		for(int i=0;i<array.length-1;i++){
			array[i] = i+2;
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				tmp =array[i];
				for(int j=0;j<array.length;j++) {
					if(array[j]!=0&&array[j]%tmp==0) {
						temp[count]=array[j];
						array[j]=0;
						count++;
					}
				}
			}
			
		}
	
		System.out.println(temp[k-1]);
		
		
	}
	
	}
