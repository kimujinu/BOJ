import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Programmers_Hash_Problem_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코딩테스트 - 완주하지 못한 선수
		
	}
	
	public String solution(String[] participant, String[] completion) {
	    String answer = "";
		HashMap<String,Integer> map = new HashMap<>();
		//1. 해시맵에 참여자 정보 입력
		for(int i=0;i<participant.length;i++) {
			if(map.containsKey(participant[i])) {
				int val = map.get(participant[i]);
				map.replace(participant[i], val+1);
			}else {
				map.put(participant[i], 1);
			}
		}
		//2. 참여자있는 map에 완주자들 넣어보기
		for(int i=0;i<completion.length;i++) {
			if(map.containsKey(completion[i])) {
				int val = map.get(completion[i]);
				if(val==1) {
					map.remove(completion[i]);
				}else if(val>1) {
					map.replace(completion[i], val-1);
				}else {
					answer = completion[i];
				}
			}
		}
		
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry entry = it.next();
			String key = (String) entry.getKey();
			answer = key;
		}
		
	    return answer;
	}

}
