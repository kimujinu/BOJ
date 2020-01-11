import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BOJ4153 {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOJ4153 Main = new BOJ4153();
		Main.start();

	}
	public void start(){
		solve();
	}
	
	public void solve() {
		double[] array = new double[3];
		while(true){
			for(int i=0;i<array.length;i++){
				array[i]=scan.nextInt();
			}
			Arrays.sort(array);
			if(array[0]==0&&array[1]==0&&array[2]==0){
				break;
			}else if(Math.pow(array[0],2)+Math.pow(array[1], 2)==Math.pow(array[2], 2)){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
		}
		
	}
}