package algo1_1;

import java.util.Scanner;

/**
 * <pre>
 * desc : 프로그래머스 1단계 - 1
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 27. 오후 11:19:42
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
		int x = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		long[] answer = solution(x,n);
		System.out.print("[");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
			if(i != answer.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	public static long[] solution(int x, int n) {
	      long[] answer = {};
	      answer = new long[n];
	      /*for(int i = 0; i < n; i++) {
	    	  answer[i] = x * (i+1);
	      }*/
	      for(long i = 0; i < n; i++) {
	    	  answer[(int) i] = x * (i+1);
	      }
	      return answer;
	  }
}
