package algo_brackets;

import java.util.Stack;

/**
 * <pre>
 * desc : Codility - Brackets
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 10. 오후 10:12:04
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 10.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) {
		

	}
	public int solution(String S) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if(stack.isEmpty()) {
					return 0;
				}
				char lastC = stack.pop();
				
				if(c == ')' && lastC != '(') {
					return 0;
				}
				if(c == '}' && lastC != '{') {
					return 0;
				}
				if(c == ']' && lastC != '[') {
					return 0;
				}
			}
		}
		if(!stack.isEmpty()) {
			return 0;
		}
		return 1;
    }
}
