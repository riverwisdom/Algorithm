/*
 * Copyright gsitm.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of gsitm.com.,LTD. ("Confidential Information").
 */
package algo2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc :
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 25. 오후 10:05:28
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 25.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = n; i > 0 ; i--) {
			System.out.println(i);
		}
	}
}
