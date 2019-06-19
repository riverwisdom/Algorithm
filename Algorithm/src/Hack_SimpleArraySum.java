import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
 * desc :
 * </pre>
 * @author kang.ji.hye
 * @since 2018. 8. 12. 오후 4:26:42
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 12.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Hack_SimpleArraySum {
	static long aVeryBigSum(long[] ar) {
		long result = 0;
		for(long i : ar) {
			result += i;
		}
		return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

         int arCount = scanner.nextInt();
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         long[] ar = new long[arCount];

         String[] arItems = scanner.nextLine().split(" ");
         scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

         for (int i = 0; i < arCount; i++) {
             long arItem = Long.parseLong(arItems[i]);
             ar[i] = arItem;
         }

         long result = aVeryBigSum(ar);
         bufferedWriter.write(String.valueOf(result));
         bufferedWriter.newLine();

         bufferedWriter.close();

         scanner.close();
     }
}
