import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.Arrays;

import java.util.Scanner;
 
public class Test {

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Test Main = new Test();
		Main.start();
 
	}
	public void start() throws IOException{
		solve();
	}
	
	public void solve() throws IOException {
		int count = 0;
		while(true){
			
			String a = in.readLine();
			String[] b = a.split(" ");
			String[] c = new String[b.length];
		
			
			if(a.equals("END")){
				break;
			}
			for(int i=0;i<b.length;i++) {
				for(int j=0;j<b.length;j++) {
					if(b[i].equals(b[j])) {
						count++;
					}
				}
				String temp = String.valueOf(count);
				c[i] = b[i] + " : "+ temp;
				count=0;
			}
			Arrays.sort(c);
			String check =" ";
			for(int i=0;i<c.length;i++) {
				if(!c[i].equals(check)) {
					System.out.printf("%s \n",c[i]);
					check = c[i];
				}
			}
			
			
		}
	}	
}