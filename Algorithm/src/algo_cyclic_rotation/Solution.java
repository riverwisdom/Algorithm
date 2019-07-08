package algo_cyclic_rotation; 

/**
 * <pre>
 * desc : Codility - CyclicRotation
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 8. 오후 11:05:00
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 8.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) {
		

	}
	public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];
        
        for(int i = 0; i < A.length; i++) {
        	result[(i+K) % A.length] = A[i];
        }
        return result;
    }
}
