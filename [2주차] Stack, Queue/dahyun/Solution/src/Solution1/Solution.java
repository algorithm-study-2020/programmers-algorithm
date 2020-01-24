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

// _�ؼ�_
// ���ÿ� ��� ���Ҹ� push
// ���ÿ��� pop �� ���ҵ��� �迭�� �� ���������� ��
// pop ���� ū ���� heights �ε���+1�� �ٽ� ���ÿ� push (������ ���ؼ�)
// ���ÿ��� �ٽ� �迭�� �Ű��� 

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