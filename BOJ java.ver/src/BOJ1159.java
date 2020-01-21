import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ1159 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ1159 Main = new BOJ1159();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int n = scan.nextInt();//1월28일에 교수님 방문
		String[] name = new String[n];
		char tmp;
		String result = "";
		int[] array = new int[30];
		for(int i=0;i<name.length;i++){
			name[i] = scan.next();
		}
		Arrays.sort(name);
		for(int i=0;i<name.length;i++){
			tmp = name[i].charAt(0);
			array[tmp-97]++;
		}
		for(int i=0;i<array.length;i++){
			if(array[i]>4){
				result+=(char)(i+97);
			}
		}
		
		if(result.equals("")){
		System.out.print("PREDAJA");
		}else{
		System.out.println(result);
		}
	}
}