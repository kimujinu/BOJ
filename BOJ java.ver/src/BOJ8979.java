import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ8979 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	rank[] rank = new rank[1000];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ8979 Main = new BOJ8979();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int result = 1;
		int answer = 0;
		for(int i=0;i<n;i++){
			rank[i] = new rank();
			rank[i].name = scan.nextInt();
			rank[i].gold = scan.nextInt();
			rank[i].sil = scan.nextInt();
			rank[i].bron = scan.nextInt();
		}
		for(int i=0;i<n;i++){
			if(rank[i].name == k){
				answer = i;
			}
		}
		for(int i=0;i<n;i++){
			if(rank[i].gold>rank[answer].gold){
				result++;
			}else if((rank[i].gold==rank[answer].gold)&&(rank[i].sil>rank[answer].sil)){
				result++;
			}else if((rank[i].gold==rank[answer].gold)&&(rank[i].sil==rank[answer].sil)&&(rank[i].bron > rank[answer].bron)){
				result++;
			}
		}
		System.out.print(result);
		
	}
	public class rank{
		public int name;
		public int gold;
		public int sil;
		public int bron;
	}
}
