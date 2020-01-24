package Solution1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		int[] heights = { 6, 9, 5, 7, 4 };
		Test t = new Test();

		int[] r = t.solution(heights);
	}
}

// _해설_
// 스택에 모든 원소를 push
// 스택에서 pop 한 원소들을 배열의 맨 끝에서부터 비교
// pop 보다 큰 값의 heights 인덱스+1을 다시 스택에 push (순서를 위해서)
// 스택에서 다시 배열로 옮겨줌 

class Test {
	public int[] solution(int[] heights) {
		int[] answer = {};
		

		Stack hStack = new Stack();
		Stack result = new Stack();
 		
		for (int i = 0; i < heights.length; i++) {
			hStack.push(heights[i]);
		}
		
		while(true) {
			int pop = (int) hStack.pop();
			int len = hStack.size();
		
			if(len==0) { result.push(0); break;	}
			for(int i=len-1;i>=0;i--) {
				if(pop<heights[i]) { result.push(i+1); break; } 
				else if (i==0 && heights[i]<pop) { result.push(0); break; }
			}				
		}

		answer = new int[result.size()];
		int len = result.size();

		for(int i=0;i<len;i++) {
			int temp = (int)result.pop();
			System.out.println("temp="+temp);
			answer[i] = temp;
		}
		
		return answer;
	}
}