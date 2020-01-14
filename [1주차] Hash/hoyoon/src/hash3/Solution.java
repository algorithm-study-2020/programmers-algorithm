package hash3;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, ArrayList<String>> clothesMap = new HashMap<String, ArrayList<String>>();
        
        for(String[] element : clothes) {
        	if(!clothesMap.containsKey(element[1])) {
        		clothesMap.put(element[1], new ArrayList<String>());
        	}
        	clothesMap.get(element[1]).add(element[0]);
        }
        
        for(String key : clothesMap.keySet()) {
        	answer *= clothesMap.get(key).size() + 1;
        }
        answer--;
        
        return answer;
    }
}
