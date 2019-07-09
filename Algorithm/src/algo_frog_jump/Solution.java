/*
 * Copyright gsitm.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of gsitm.com.,LTD. ("Confidential Information").
 */
package algo_frog_jump;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc :Codility - FrogJump
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 7. 9. 오후 11:29:40
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 7. 9.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int d = Integer.parseInt(br.readLine());
		
		System.out.println(solution(x,y,d));
	}
	public static int solution(int X, int Y, int D) {
        int result = 0;
        result = (Y-X) % D;
        if((Y-X) % D == 0) {
        	result = (Y-X) / D;
        } else {
        	result = ((Y-X) / D)+ 1;
        }
        return result;
    }
}
