package Solution2;

import java.util.*;

class Solution2 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;

//		처음 내가 푼 답 
//		HashMap<String, String> phone_book_map = new HashMap<String, String>();
//
//		ArrayList<String> pre_num = new ArrayList<String>();
//		for (int i = 0; i < phone_book.length; i++) {
//			String pre = phone_book[i].substring(0, 1);
//			if (phone_book_map.containsKey(pre)) {
//				answer = false;
//				break;
//			}
//			pre_num.add(pre);
//			phone_book_map.put(pre, phone_book[i]);
//		}

		// 정답
		Arrays.sort(phone_book);
		for(int i=0; i<phone_book.length-1; i++ ){
            if(phone_book[i+1].startsWith(phone_book[i]))
            {answer= false; break;}
        }		
		
		return answer;
	}
}