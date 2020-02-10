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
	 * 안녕하세요, 매일프로그래밍 이번주 문제입니다.
		정수 배열과 타겟 숫자가 주어지면, 합이 타겟값이 되는 두 원소의 인덱스를 찾으시오.
		단, 시간복잡도 O(n) 여야 합니다.
		Given an array of integers and a target integer, find two indexes of the array element that sums to the target number.

		예제)
		Input: [2, 5, 6, 1, 10], 타겟 8
		Output: [0, 2] // 배열[0] + 배열[2] = 8
	 */
}