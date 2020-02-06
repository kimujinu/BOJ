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
 * 	안녕하세요, 매일프로그래밍 이번주 문제입니다. 
	피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다. 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
	Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers. Given an integer N, find the sum of all even fibonacci numbers.
	
	예제)

	Input: N = 12
	Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.

 */
}


