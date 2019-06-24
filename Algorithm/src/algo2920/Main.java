package algo2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * <pre>
 * desc : 2920, 음계
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 24. 오후 10:51:00
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 24.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] scale = br.readLine().split(" ");
		int[] num = new int[scale.length];
		for(int i = 0 ; i < 8; i++) {
			num[i] = Integer.parseInt(scale[i]);
		}
		System.out.println(getResult(num));

	}
	public static String getResult(int[] scale) {
		boolean isAscending = false;
		boolean isDescending = false;
		String result = "mixed";
		int temp = 8;
		for(int i = 0; i < 8; i++) {
			if(scale[i] == i+1) {
				isAscending = true;
			} else {
				isAscending = false;
				break;
			}
		}
		
		if(!isAscending) {
			for(int i = 0; i < 8; i++) {
				if(scale[i] == temp) {
					isDescending = true;
				} else {
					isDescending = false;
					break;
				}
				temp--;
			}
		}
		if(isAscending) {
			result = "ascending";
		} else if(isDescending) {
			result = "descending";
		}
		return result;
	}

}
