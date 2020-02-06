import java.util.Scanner;

public class MailProgramming_CodingTest_1 {

	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		MailProgramming_CodingTest_1 Main = new MailProgramming_CodingTest_1();
		Main.start();
	}
	
	public void start() {
		solve();
		}
		  
	public void solve() {
		int sum = 0;
		int[] array = {-1, 3, -1, 5};
		int result = array[0];
		for(int i=0;i<array.length;i++) {
			sum = array[i];
			if(array[i]>result) {
				result = array[i];
			}
			for(int j=i+1;j<array.length;j++) {
				sum+=array[j];
				if(sum>result) {
					result = sum;
				}
			}
		}
		System.out.print(result);
	}

}
/*	 안녕하세요, 매일프로그래밍 이번주 문제입니다.
		정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
	Given an integer array, find the largest consecutive sum of elements.

	예제}
	Input: [-1, 3, -1, 5]
	Output: 7 // 3 + (-1) + 5

	Input: [-5, -3, -1]
	Output: -1 // -1

	Input: [2, 4, -2, -3, 8]
	Output: 9 // 2 + 4 + (-2) + (-3) + 8
*/