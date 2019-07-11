package algo_perm_check;

import java.util.Arrays;

/**
 * <pre>
 * desc : Codility - PermCheck
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 11. 오후 10:48:28
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 11.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {
	public int solution(int[] A) {
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
        	if(A[i] != i + 1) {
        		return 0;
        	}
        }
        return 1;
    }
}
