
package algo2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc : 2839, 설탕 배달
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 21. 오후 11:51:44
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 21.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int result = -1;
		
		if(n % 5 == 0) {
			result = n / 5;
		} else {
			for(int i = n / 5; i > 0; i--) {
				if((n - 5 * i) % 3 == 0) {
					result = i + ((n - 5 * i) / 3);
					break;
				}
			}
			if(result == -1 && n % 3 == 0) {
				result = n / 3;
			}
			
		}
		System.out.println(result);

	}
}
