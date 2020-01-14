import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

class Solution3 {
    public int solution(String[][] clothes) {
	        int answer = 1;
	        
	        HashMap<String, Integer> clothes_kind = new HashMap<String, Integer>();
	        
	        for(int i=0;i<clothes.length;i++){
	            if(!clothes_kind.containsKey(clothes[i][1]))
	            	clothes_kind.put(clothes[i][1], 2);
	            else 
	            	clothes_kind.put(clothes[i][1], clothes_kind.get(clothes[i][1])+1);    
	        }
	        
	        Object[] keySet = clothes_kind.keySet().toArray();
	        System.out.println(clothes_kind.get("face"));    
        
	        for(int i=0;i<keySet.length;i++) 
	         	answer = answer * clothes_kind.get(keySet[i].toString());
	        
	        return --answer;
	    }
}