package hash4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
	public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        HashMap<String, ArrayList<Integer>> classifiedSongs = new HashMap<String, ArrayList<Integer>>();
        HashMap<String, Integer> playsForGenre = new HashMap<String, Integer>();
        
        for(int i = 0; i < genres.length; i++) {
        	String genre = genres[i];
        	if(!classifiedSongs.containsKey(genre)) {
        		classifiedSongs.put(genre, new ArrayList<Integer>());
        	}
        	classifiedSongs.get(genre).add(i);
        	
        	if(!playsForGenre.containsKey(genre)) {
        		playsForGenre.put(genre, 0);
        	}
        	playsForGenre.replace(genre, playsForGenre.get(genre) + plays[i]);
        }
        
        ArrayList<String> sortGenrePlays = new ArrayList<String>();
        sortGenrePlays.addAll(playsForGenre.keySet());
        Collections.sort(sortGenrePlays, new Comparator<String>() {
        	@Override
			public int compare(String o1, String o2) {
				return playsForGenre.get(o2) - playsForGenre.get(o1);
			}
		});
        
        for(String genre : sortGenrePlays) {
        	Collections.sort(classifiedSongs.get(genre), new Comparator<Integer>() {
				@Override
				public int compare(Integer o1, Integer o2) {
					return plays[o2] - plays[o1];
				}
			});
        	
        	for(int i = 0; i < 2 && i < classifiedSongs.get(genre).size(); i++) {
        		answerList.add(classifiedSongs.get(genre).get(i));
        	}
        }
         
        answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}
