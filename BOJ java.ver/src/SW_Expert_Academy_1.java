import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SW_Expert_Academy_1 {
	static int[] person = new int[1001];
	 static int temp = 0;
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		solve();
	}
	
	public static void solve() throws IOException  {
		Scanner scan =new Scanner(new File("input.txt"));
		int T = scan.nextInt();
		while(scan.hasNext()) {
			for(int j=0;j<T;j++) {
			    int[] score = new int[101];
			    int index = 0;
			    int max = 0;
				
				int seq = scan.nextInt();
				
				for(int i=0;i<1000;i++) {
					score[scan.nextInt()]++;
				}
				
				for(int i=0;i<score.length;i++) {
					if(score[i]>=max) {
						max = score[i];
						index = i;
					}
				}
				
				System.out.println("#"+seq+" "+index);
				
			}
			
			
		}
	}

}
