import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ2108 {
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BOJ2108 Main = new BOJ2108();
		Main.start();

	}
	public void start() throws IOException{
		solution();
	}
	public void solution() throws IOException {
			int N = Integer.parseInt(in.readLine());
	        int[] arr = new int[N];
	        int[] check = new int[8001];
	        int sum = 0;
	    
	        for(int i=0 ; i<N ; i++){
	            arr[i] =  Integer.parseInt(in.readLine());
	            check[arr[i]+4000]++;
	            sum += arr[i];
	        }
	        
	        int maxIndex = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0 ; i<8001 ; i++){
	            if(check[maxIndex] < check[i]){
	                maxIndex = i;
	                list.clear();
	            }
	            else if(check[i]!=0 && check[i]==check[maxIndex]){
	                list.add(i-4000);
	            }
	        }
	        
	        Arrays.sort(arr);
	        
	        System.out.println((int)Math.round((double)sum/N));
	        System.out.println(arr[N/2]);
	        if(list.size()!=0)
	            System.out.println(list.get(0));
	        else
	            System.out.println(maxIndex-4000);
	        System.out.println(arr[N-1]-arr[0]);
	    }
}