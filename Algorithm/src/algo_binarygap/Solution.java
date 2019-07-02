package algo_binarygap;

import java.util.Scanner;

/**
 * <pre>
 * desc : Codility - BinaryGap
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 1. 오후 10:24:17
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 1.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(solution(num));
		sc.close();
		
	}
	public static int solution(int N) {
		int binaryGap = 0;
		int tmpBinaryGap = 0;
        boolean isZero = false;
		String binaryN = Integer.toBinaryString(N);
		
		for(int i = 0 ; i < binaryN.length(); i++) {
			if(binaryN.charAt(i) == '0') {
				tmpBinaryGap++;
				isZero = true;
			} else {
				if(!isZero) {
					tmpBinaryGap = 0;
				}
				if(tmpBinaryGap >= binaryGap) {
					binaryGap = tmpBinaryGap;
				}
				tmpBinaryGap = 0;
				isZero = false;
			}
		}
		return binaryGap;
    }

}
