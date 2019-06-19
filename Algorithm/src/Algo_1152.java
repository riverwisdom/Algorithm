import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Copyright gsitm.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of gsitm.com.,LTD. ("Confidential Information").
 */

/**
 * <pre>
 * desc :
 * </pre>
 * @author kang.ji.hye
 * @since 2018. 8. 16. 오후 9:25:55
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 16.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Algo_1152 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
	public static void main(String[] args) {
		try {
			String input = br.readLine();
			int result = 0;
			for(char c : input.toCharArray()) {
				if (c == ' ') {
					result++;
				}
			}
			System.out.println(result + 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
