import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MailProgramming_CodingTest_5 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		MailProgramming_CodingTest_5 Main = new MailProgramming_CodingTest_5();
		Main.start();
	}
	
	public void start() throws NumberFormatException, IOException {
		int[] Input = {2, 5, 6, 1, 10};
		int target = scan.nextInt();
		System.out.println(solve(Input,target));
	}
		  
	public int[] solve(int[] input, int target) throws NumberFormatException, IOException {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		 for(int i=0;i<input.length;i++) {
	            if(map.containsKey(input[i])){
	                return new int[] {map.get(input[i]), i};
	            }else {
	            	map.put(target-input[i], i);
	            }
	        } 
	        return new int[] {0,0};
	}
	/*
	 * �ȳ��ϼ���, �������α׷��� �̹��� �����Դϴ�.
		���� �迭�� Ÿ�� ���ڰ� �־�����, ���� Ÿ�ٰ��� �Ǵ� �� ������ �ε����� ã���ÿ�.
		��, �ð����⵵ O(n) ���� �մϴ�.
		Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.

		����)
		Input: [2, 5, 6, 1, 10], Ÿ�� 8
		Output: [0, 2] // �迭[0] + �迭[2] = 8
	 */
}