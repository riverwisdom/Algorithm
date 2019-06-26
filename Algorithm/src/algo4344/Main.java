package algo4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <pre>
 * desc : 4344, 평균은 넘겠지
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 26. 오후 10:46:06
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 26.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			String[] input = br.readLine().split(" ");
			int studentNum = Integer.parseInt(input[0]);
			int[] score = new int[studentNum];
			int sum = 0;
			double avgScore = 0;
			int avgNumOfStudents = 0;
			
			for(int j = 0; j < studentNum; j++) {
				score[j] = Integer.parseInt(input[j+1]);
				sum += score[j];
			}
			avgScore = sum / studentNum;
			avgNumOfStudents = 0;
			for(int j = 0; j < studentNum; j++) {
				if(score[j] > avgScore) avgNumOfStudents++;
			}
			
			System.out.printf("%.3f", 100.0 * avgNumOfStudents / studentNum);
            System.out.println("%");	
		}
		br.close();
	}
}
