import java.util.Scanner;

public class MailProgramming_CodingTest_2 {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		MailProgramming_CodingTest_2 Main = new MailProgramming_CodingTest_2();
		Main.start();
	}
	
	public void start() {
		solve();
	}
		  
	public void solve() {
		int N = 12;
		int[] array = new int[N+1];
		int result = 0;
		array[0]=0;
		array[1]=1;
		for(int i=2;i<=N;i++) {
			array[i] = array[i-1]+array[i-2];
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0 && array[i]<N) {
				result += array[i];
			}
		}
		System.out.print(result);
	}
/*
 * 	�ȳ��ϼ���, �������α׷��� �̹��� �����Դϴ�. 
	�Ǻ���ġ �迭�� 0�� 1�� �����ϸ�, ���� �Ǻ���ġ ���� �ٷ� ���� �� �Ǻ���ġ ���� ���� �ȴ�. ���� N�� �־�����, N���� ���� ��� ¦�� �Ǻ���ġ ���� ���� ���Ͽ���.
	Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. Given an integer N, find the sum of all even fibonacci numbers.
	
	����)

	Input: N = 12
	Output: 10 // 0, 1, 2, 3, 5, 8 �� ¦���� 2 + 8 = 10.

 */
}


