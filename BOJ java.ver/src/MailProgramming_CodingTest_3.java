import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailProgramming_CodingTest_3 {
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		MailProgramming_CodingTest_3 Main = new MailProgramming_CodingTest_3();
		Main.start();
	}
	
	public void start() {
		 int n = scan.nextInt();
		 List<String> ans = new ArrayList();
		 solve(ans, "", 0, 0, n);
	       for(String str : ans) {
	           System.out.println(str);
	       }
	}
		  
	public void solve(List ans, String cur, int open, int close, int n) {
		if(cur.length() == n * 2) {
            ans.add(cur.toString());
            return;
        }
        
        if(open < n) {
        	solve(ans, cur + "(", open + 1, close, n);
        }
        
        if(close < open) {
        	solve(ans, cur + ")", open, close + 1, n);
		}
	}
}
	/*
	 * �ȳ��ϼ���, �������α׷��� �̹��� �����Դϴ�.
 
		���� n�� �־�����, n���� ���� ��ȣ "("�� n���� �ݴ� ��ȣ ")"�� ���� �� �ִ� ��ȣ ������ ��� ���Ͻÿ�. (�ð� ���⵵ ���� �����ϴ�).
		Given an integer N, find the number of possible balanced parentheses with N opening and closing brackets.

		����)

		Input: 1
		Output: ["()"]

		Input: 2
		Output: ["(())", "()()"]

		Input: 3
		Output: ["((()))", "(()())", "()(())", "(())()", "()()()"]
	 
	 */
