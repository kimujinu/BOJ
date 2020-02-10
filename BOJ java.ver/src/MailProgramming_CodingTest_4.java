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
/*�ȳ��ϼ���, �������α׷��� �̹��� �����Դϴ�.

����(int)�� �־�����, �Ӹ����(palindrome)���� �˾Ƴ��ÿ�. �Ӹ�����̶�, �տ������� ������ �ڿ������� ������ ���� �ܾ ���մϴ�. ��, ������ ���ڿ��� �ٲٸ� �ȵ˴ϴ�.
Given an integer, check if it is a palindrome.

����)

	Input: 12345
	Output: False

	Input: -101
	Output: False

	Input: 11111
	Output: True

	Input: 12421
	Output: True
	
*/