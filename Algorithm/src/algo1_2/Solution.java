package algo1_2;

import java.util.Scanner;

/**
 * <pre>
 * desc : 프로그래머스 1단계 - 2
 * 
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. 
 * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 
 * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 * 예를들어 s가 pPoooyY면 true를 return하고 Pyy라면 false를 return합니다.
 * 
 * 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.

 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 27. 오후 11:55:10
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 27.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s = s.toLowerCase();
		System.out.println(solution(s));
		sc.close();
	}
	static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == 'p') {
        		pCount++;
        	} else if(s.charAt(i) == 'y') {
        		yCount++;
        	}
        }
        if(pCount == 0 && yCount == 0) {
        	answer = true;
        } else if(pCount != yCount) {
        	answer = false;
        }
        
        return answer;
    }

}
