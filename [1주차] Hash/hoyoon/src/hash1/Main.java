package hash1;

public class Main {

	public static void main(String[] args) {
		String[] part = {"leo", "kiki", "eden"};
		String[] comp = {"eden", "kiki"};
		
		/*String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] comp = {"josipa", "filipa", "marina", "nikola"};*/
		
		/*String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};*/
		
		Solution sol = new Solution();
		System.out.println(sol.solution(part, comp));
	}

}
