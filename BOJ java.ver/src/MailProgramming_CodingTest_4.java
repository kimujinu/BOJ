import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailProgramming_CodingTest_4 {
	Scanner scan = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		MailProgramming_CodingTest_4 Main = new MailProgramming_CodingTest_4();
		Main.start();
	}
	
	public void start() throws NumberFormatException, IOException {
		solve();
	}
		  
	public void solve() throws NumberFormatException, IOException {
		int input = Integer.parseInt(in.readLine());
		int temp = input;
		int temp2 = 0;
		while(temp!=0) {
			 int a = temp %10;
			 temp /=10;
			 temp2 = (temp2+ a)*10;
		}
		temp2 = temp2 / 10;
		if(temp2!=input || input<0) {
			System.out.println("False");
		}else{
			System.out.println("True");
		}
	}
}
/*안녕하세요, 매일프로그래밍 이번주 문제입니다.

정수(int)가 주어지면, 팰린드롬(palindrome)인지 알아내시오. 팰린드롬이란, 앞에서부터 읽으나 뒤에서부터 읽으나 같은 단어를 말합니다. 단, 정수를 문자열로 바꾸면 안됩니다.
Given an integer, check if it is a palindrome.

예제)

	Input: 12345
	Output: False

	Input: -101
	Output: False

	Input: 11111
	Output: True

	Input: 12421
	Output: True
	
*/