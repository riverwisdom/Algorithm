import java.io.BufferedWriter;
import java.io.IOException;
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
 * desc : 4673 셀프넘버
 * </pre>
 * @author kang.ji.hye
 * @since 2018. 8. 11. 오후 10:21:01
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 11.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Algo_4673 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {

		boolean isNotSelfNumber[] = new boolean[10000];

		for(int i=1; i<=10000; i++) {
			int notSelfNumber = selfNumber(i);
			if(notSelfNumber <= 10000) {
				isNotSelfNumber[notSelfNumber-1] = true;
			}
		}
		for(int i=1; i<=10000; i++) {
			if(isNotSelfNumber[i-1] == false) {
				bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
	}

	private static int selfNumber(int i) {
		int sum = i;
		while(i != 0) {
			sum += i % 10;
			i /= 10;
		}
		return sum;
	}
}
