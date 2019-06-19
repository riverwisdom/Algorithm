import java.util.Arrays;
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
 * desc : 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 17. 오후 11:03:16
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 17.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Algo_10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		for(int i = 0 ; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[1]);
		sc.close();

	}

}
