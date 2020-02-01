import java.util.Scanner;

public class BOJ5618 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ5618 Main = new BOJ5618();
		Main.start();
	}
	public void start() {
		solution();
	}
	public void solution() {
		int n = scan.nextInt();
		int[] array = new int[n];
		int min = 0;
		for(int i=0;i<n;i++) {
			array[i] = scan.nextInt();
			if (i == 0) {
				min = array[0];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		
		if(n==2) {
				for(int i=1;i<=min;i++) {
					if(array[0]%i==0 && array[1]%i==0) {
						System.out.println(i);
					}
				}
			
		}else {
				for(int i=1;i<=min;i++) {
					if(array[0]%i==0 && array[1]%i==0 && array[2]%i==0) {
						System.out.println(i);
					}
				}
		}

	}
}