import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SW_Expert_Academy_5 {
	
	static int array[][] = new int[100][100];
	static boolean flag = false;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(new File("input5.txt"));
		while(scan.hasNext()) {
			int result = 0;
			
			int T = scan.nextInt();
			flag = false;
			
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					array[i][j] = scan.nextInt();
				}
			}
			
			for(int i=0;i<100;i++) {
				if(array[0][i] == 1) {
						findpath(0,i);
						
						if(flag) {
							result = i;
							break;
						}
					}
				}
				System.out.println("#"+T+" "+result);
			}
			
		}

	private static void findpath(int i, int j) {
		// TODO Auto-generated method stub
		boolean[][] check = new boolean[100][100];
		while(i<100) {
			check[i][j] = true;
			if(array[i][j] == 2) {
				flag = true;
				break;
			}
			if(j-1>=0 && array[i][j-1] == 1 && check[i][j-1] == false) {
				j--;
			}else if(j+1<100 && array[i][j+1] == 1 && check[i][j+1] == false) {
				j++;
			}else{
				i++;
			}
		}
	}
	
	
	}


