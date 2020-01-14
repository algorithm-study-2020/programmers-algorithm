import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution4 {
	// 장르별로 plays 더하기
	public HashMap<String, Integer> addPlays(String[] genres, int[] plays){
		HashMap<String, Integer> genresAndPlayScore = new HashMap<String, Integer>();
		
        // 각 장르별로 더하기
		 for(int i=0;i<genres.length;i++) {
		 	if(!genresAndPlayScore.containsKey(genres[i]))
		 		genresAndPlayScore.put(genres[i], plays[i]);
		 	else 
		 		genresAndPlayScore.put(genres[i], genresAndPlayScore.get(genres[i]) + plays[i]);
		 }
		 return genresAndPlayScore;
	}

	// 가장 plays가 높은 장르 리턴 
	public String findTopGenres(HashMap<String, Integer> genresAndPlayScore) {
		int topPlays = 0 ; 
		String topGenres="";
		
		for (String key: genresAndPlayScore.keySet()) {
			if (topPlays < genresAndPlayScore.get(key)) {
				topPlays = genresAndPlayScore.get(key);
				topGenres = key;
			}			
		}
		return topGenres; 
	}
	
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		HashMap<Integer, String> genresMap = new HashMap<Integer, String>();
		HashMap<Integer, Integer> playsMap = new HashMap<Integer, Integer>();
		HashMap<String, Integer> genresAndPlayScore = addPlays(genres, plays);
		
		
		for(int i=0;i<genres.length;i++) {
			genresMap.put(i, genres[i]);
			playsMap.put(i, plays[i]);
		}
		
		
		// 가장 plays가 높은 장르를 리턴받고
		String topGenre = findTopGenres(genresAndPlayScore);
	
		// 이 구간에서 인덱스를 answer에 추가해주는 작업 아직 반복문 삽입은 안했음 
		////////////////////////
		int top = 0;
		int index = 0;
		for(int i=0;i<genres.length;i++) {
			if(genresMap.get(i)==topGenre && playsMap.get(i) > top) {
				top = playsMap.get(i);
				index = i;
			}
		}		
		genresAndPlayScore.remove(topGenre);
		temp.add(index);
		///////////////////////// 
		
		
		return answer;
	}
}