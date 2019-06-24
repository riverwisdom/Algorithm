package algo2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc : 2908, 상수
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 23. 오후 11:30:49
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 23.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] num = br.readLine().split(" ");
		
		String num1 = "";
		String num2 = "";
		for(int i=2; i >=0; i--) {
			num1 += num[0].charAt(i) + "";
			num2 += num[1].charAt(i) + "";
		}
	
		if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}

}
