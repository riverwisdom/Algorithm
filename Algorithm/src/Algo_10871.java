import java.io.IOException;
import java.util.Scanner;

/*
 * Copyright gsitm.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of gsitm.com.,LTD. ("Confidential Information").
 */

/**
 * <pre>
 * desc :세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * </pre>
 * @author kang.ji.hye
 * @since 2018. 8. 9. 오후 9:57:10
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 9.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Algo_10871 {
    
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int num[] = new int[n];
		for(int i = 0 ; i < n; i++) {
			num[i] = sc.nextInt();
			if(num[i] < x) sb.append(num[i] + " ");
		}
		System.out.println(sb);
		sc.close();

	}

}
