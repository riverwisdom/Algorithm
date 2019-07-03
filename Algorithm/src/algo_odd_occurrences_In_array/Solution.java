package algo_odd_occurrences_In_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc : Codility - OddOccurrencesInArray
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 3. 오후 10:05:02
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 3.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num[] = br.readLine().split(",");
		int A[] = new int[num.length];
		
		for(int i = 0; i < num.length; i++) {
			A[i] = Integer.parseInt(num[i]);
		}
		System.out.println(solution(A));
		br.close();

	}
	public static int solution(int[] A) {
        int result = 0;
        int temp[] = new int[A.length];
        for(int i = 0 ; i < A.length; i++) {
        	temp[i] = 0;
        }
        for(int i = 0 ; i < A.length; i++) {
        	for(int j = 0; j < A.length; j++) {
        		if(A[i] == A[j]) {
        			temp[i]++;
        		}
        	}
        }
        for(int i = 0; i < A.length; i++) {
        	if(temp[i] % 2 != 0) {
        		result = A[i];
        	}
        }
        return result;
    }

}
