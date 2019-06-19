import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
 * @since 2018. 8. 9. 오후 11:01:57
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 9.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Algo_11721 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    String input = br.readLine();

	    int temp = 0;
	    while(temp + 10 <= input.length()) {
	    	bw.write(input.substring(temp, temp+10)+"\n");
	    	temp += 10;
	    }
	    if(input.length() % 10 != 0) {
	    	bw.write(input.substring(temp));
	    }
	   	bw.flush();
	   	bw.close();
	   	br.close();
	    
	}

}
