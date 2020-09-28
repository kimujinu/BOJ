import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ2108 {
			
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = new int[8001];
		int val = 0;
		int sum = 0;
		
		for(int i=0; i<len; i++) {
			val = Integer.parseInt(br.readLine());
			arr[4000+val]++;
			sum += val;
			list.add(val);
		}
		
		System.out.println(Math.round((double)sum/len));
		
		Collections.sort(list);
		System.out.println(list.get(len/2));
		
		int[] two_num = new int[2];
		int mode = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>mode) {
				mode = arr[i];
				two_num[0]=i-4000; two_num[1]=0;
			}else if(arr[i]==mode && mode!=0 && two_num[1]==0) {
				two_num[1]=i-4000;
			}
		}
		if(two_num[1]==0) {
			System.out.println(two_num[0]);
		}else {
			System.out.println(two_num[1]);
		}
		
		System.out.println(list.get(len-1)-list.get(0));
		
	}
	
}