import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BOJ1302 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> map = new HashMap<>();
		int max = 0;
		for(int i=0;i<N;i++) {
			String name = br.readLine();
			if(map.containsKey(name)) {
				map.put(name, map.get(name)+1);
			}else {
				map.put(name, 1);
			}
			if(map.get(name)>max) {
				max = map.get(name);
			}
		}
		List<String> list = new ArrayList<>();
		for(String key : map.keySet()) {
			if(map.get(key)==max) {
				list.add(key);
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		
				

	}
}

