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
/*	 �ȳ��ϼ���, �������α׷��� �̹��� �����Դϴ�.
		���� �迭(int array)�� �־����� ���� ū �̾����� ���ҵ��� ���� ���Ͻÿ�. ��, �ð����⵵�� O(n).
	Given an integer array, find the largest consecutive sum of elements.

	����}
	Input: [-1, 3, -1, 5]
	Output: 7 // 3 + (-1) + 5

	Input: [-5, -3, -1]
	Output: -1 // -1

	Input: [2, 4, -2, -3, 8]
	Output: 9 // 2 + 4 + (-2) + (-3) + 8
*/