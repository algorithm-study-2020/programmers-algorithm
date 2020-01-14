import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution4 {
	public void rankGenres(HashMap<String, Integer> hs) {
		Object[] hskey = hs.keySet().toArray();
		Object[] hsvalue = hs.values().toArray();
		
		for(int i=0;i<hsvalue.length;i++) {
			//System.out.println(value[i]);
		}
	}
	
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		HashMap<String, Integer> genresAndPlayScore = new HashMap<String, Integer>();
		
		for(int i=0;i<genres.length;i++) {
			if(!genresAndPlayScore.containsKey(genres[i]))
				genresAndPlayScore.put(genres[i], plays[i]);
			else 
				genresAndPlayScore.put(genres[i], genresAndPlayScore.get(genres[i]) + plays[i]);
		}
		
		rankGenres(genresAndPlayScore);
		
		return answer;
	}
}
