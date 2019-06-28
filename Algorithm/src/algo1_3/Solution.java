package algo1_3;

import java.util.Scanner;

/**
 * <pre>
 * desc :
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 28. 오후 11:54:51
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 28.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));
		sc.close();
	}
	public static int solution(int num) {
	      int answer = 0;
	      long n = Long.valueOf(num);
	      
	      while(n != 1) {
	    	  if(n % 2 == 0) {
		    	  n /= 2;
		    	  answer++;
		      } else {
		    	  n = n * 3 + 1;
		    	  answer++;
		      }
	    	 if(answer == 500) {
	    		 answer = -1;
	    		 break;
	    	 }
	      }
	      
	      return answer;
	  }
}
