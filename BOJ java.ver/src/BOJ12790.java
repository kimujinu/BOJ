import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ12790 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ12790 Main = new BOJ12790();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
		int t = scan.nextInt();
		int[][] array = new int[t][8];
		int[] result = new int[t];
		int[] hp = new int[t];
		int[] mp = new int[t];
		int[] attack = new int[t];
		int[] barrior = new int[t];
		for(int i=0;i<t;i++){
			for(int j=0;j<8;j++){
				array[i][j] = scan.nextInt();
			}
		}
		int count = 0;
		for(int i=0;i<t;i++){
			hp[i]=array[i][count]+array[i][count+4];
			if(hp[i]<1){
				hp[i] = 1;
			}
			mp[i]=array[i][count+1]+array[i][count+5];
			if(mp[i]<1){
				mp[i] = 1;
			}
			attack[i]=array[i][count+2]+array[i][count+6];
			if(attack[i]<0){
				attack[i] = 0;
			}
			barrior[i]=array[i][count+3]+array[i][count+7];
		}
		for(int i=0;i<t;i++){
			result[i] = (1*hp[i])+(5*mp[i])+(2*attack[i])+(2*barrior[i]);
		}
		
		for(int i=0;i<t;i++){
			System.out.println(result[i]);
		}
	}
}