package algo2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc :2577, 숫자의 개수
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 22. 오후 10:57:31
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 22.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		long result = num1 * num2 * num3;
		
		String resultToString = Long.toString(result);
		char ch[] = resultToString.toCharArray();
		int count[] = new int[10];
		
		for(int i = 0; i < ch.length; i++) {
			switch(ch[i]){
	        case '0' : 
	        	count[0]++; 
	            break;
	        case '1' : 
	        	count[1]++; 
	            break;
	        case '2' : 
	        	count[2]++; 
	            break;
	        case '3' : 
	        	count[3]++; 
	            break;
	        case '4' : 
	        	count[4]++; 
	            break;
	        case '5' : 
	        	count[5]++; 
	            break;
	        case '6' : 
	        	count[6]++; 
	            break;
	        case '7' : 
	        	count[7]++; 
	            break;
	        case '8' : 
	        	count[8]++; 
	            break;
	        case '9' : 
	        	count[9]++; 
	            break;
			}
		}
		for(int i : count) {
			System.out.println(i);
		}
	}

}
