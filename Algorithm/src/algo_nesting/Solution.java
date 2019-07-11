package algo_nesting;

import java.util.Stack;

/**
 * <pre>
 * desc : Codility - Nesting
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 10. 오후 11:15:01
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 10.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {
	public int solution(String S) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : S.toCharArray()) {
        	if(c == '(') {
        		stack.push(c);
        	} else {
        		if(stack.isEmpty() || stack.pop() != '(') {
        			return 0;
        		}
        	}
        }
        if(stack.isEmpty()) {
        	return 1;
        } else {
        	return 0;
        }
       
    }
}
