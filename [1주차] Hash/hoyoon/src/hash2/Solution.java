package hash2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<Integer, ArrayList<String>> lengths = new HashMap<Integer, ArrayList<String>>();
        
        for(String phoneNum : phone_book) {
        	if(!lengths.containsKey(phoneNum.length())) {
        		lengths.put(phoneNum.length(), new ArrayList<String>());
        	}
        	lengths.get(phoneNum.length()).add(phoneNum);
        }
        
        ArrayList<Integer> keys = new ArrayList<Integer>();
        keys.addAll(lengths.keySet());
        
        for(int i = 0; i < keys.size() - 1; i++) {
        	for(String num : lengths.get(keys.get(i))) {
        		for(int j = i + 1; j < keys.size(); j++) {
        			final int tmp = i;
        			answer = lengths.get(keys.get(j)).stream().allMatch(it -> !it.substring(0, keys.get(tmp)).equals(num));
        			if(!answer) return answer;
        		}
        	}
        }
        
        return answer;
    }
}
