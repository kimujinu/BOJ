import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ10814_ver2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		List<Person> p = new ArrayList<>();
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			p.add(new Person(Integer.parseInt(st.nextToken()),st.nextToken()));
			
		}
		
		Collections.sort(p);
		for(int i=0;i<N;i++) {
			System.out.println(p.get(i));
		}
	}
	
}

class Person implements Comparable<Person>{
	private int age;
	private String name;
	
	@Override
	public int compareTo(Person p) {
		return this.age-p.age;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return age+" "+name;
	}
	

}
