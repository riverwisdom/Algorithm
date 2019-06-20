package algo2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc : 2438, 별 찍기 - 1
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 20. 오후 11:11:41
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 20.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < n; i++){
			sb1.append("*");
			sb2.append(sb1+"\n");
		}
		System.out.println(sb2);
	}
}
