import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1181 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1181 Main = new BOJ1181();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int n = scan.nextInt();
		String temp = "";
		String[] dictionary = new String[n];
		for(int i=0;i<dictionary.length;i++){
			dictionary[i] = scan.next();
		}
		Arrays.sort(dictionary);
		for(int i=0;i<dictionary.length;i++){
			for(int j=1;j<dictionary.length-i;j++){
				if(dictionary[j-1].length()>dictionary[j].length()){
					temp = dictionary[j-1];
					dictionary[j-1] = dictionary[j];
					dictionary[j] = temp;
				}
			}
		}
		for(int i=1;i<dictionary.length;i++){
			if(!dictionary[i-1].equals(dictionary[i])){
				System.out.println(dictionary[i-1]);
			}
		}
		System.out.print(dictionary[dictionary.length-1]);
	}
}