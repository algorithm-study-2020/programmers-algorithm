import java.util.*;

class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> phone_book_map = new HashMap<String, String>();
        
        ArrayList<String> pre_num = new ArrayList<String>();
        for(int i=0;i<phone_book.length;i++){    
            String pre = phone_book[i].substring(0,2);
            if(phone_book_map.containsKey(pre)){
                answer = false;
                break;
            }
            pre_num.add(pre);
            phone_book_map.put(pre, phone_book[i]);
        }
        return answer;
    }
}