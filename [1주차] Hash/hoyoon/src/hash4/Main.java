package hash4;

public class Main {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] answer = new Solution().solution(genres, plays);
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

}
