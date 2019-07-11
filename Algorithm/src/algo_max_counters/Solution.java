package algo_max_counters;

import java.util.Arrays;

/**
 * <pre>
 * desc : Codility - MaxCounters
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 11. 오후 11:05:50
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 11.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {
	public int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int maxCounters = 0;
		Arrays.fill(result, 0);
		
	    for(int i = 0; i < A.length; i++) {
		   if(A[i] >= 1 && A[i] <= N) {
			   result[A[i]-1]++;
			   if(result[A[i]-1] > maxCounters) maxCounters = result[A[i]-1];
		   } else if(A[i] == N + 1) {
			   Arrays.fill(result, maxCounters);
		   }
	    }
	    return result;
	}
}
