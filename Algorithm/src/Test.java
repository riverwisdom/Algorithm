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
 * @since 2019. 4. 1. 오후 10:25:29
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 4. 1.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Test {
	public static void main(String args[]) {
		String num = "0";
		get(num);
		
		/*int add[2][2] = {{1,2},{1,2}};
		int add1[2][2] = {1,2,3,4};
		System.out.println(a[1][1]);
		
		int a[] = {10};
		int ab[] = {5};
		//ab[0];
		int a,b,c;
		int ddd[3] = {a,b,c};*/
		
		int jh[] = new int[5];
		jh[4] = 1;
		System.out.println(jh[1]);
		System.out.println(jh[4]);
		System.out.println('A' + 'B');
		System.out.println('A');
		
		char c = 'A'; int n = 0; n = c - n;
		char c1 = 'B'; int n1 = 0; n1 = c1 - n1;
		char c2 = 'a'; int n2 = 0; n2 = c2 - n2;
		System.out.println(n);
		System.out.println(n1);
		System.out.println(n2);
		
	}
	
	static void get(String num) {
		if(num != "0" && !num.equals("")) {
			System.out.println("땡떙땡");
		}
	}
}
