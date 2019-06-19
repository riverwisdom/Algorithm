import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 * Copyright gsitm.com.,LTD.
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information
 * of gsitm.com.,LTD. ("Confidential Information").
 */

/**
 * <pre>
 * desc : 패커랭크 Compare the Triplets
 * </pre>
 * @author kang.ji.hye
 * @since 2018. 8. 12. 오후 4:06:19
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2018. 8. 12.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Hack_ComparetheTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> score = new ArrayList<>();
    	int aliceScore = 0;
    	int bobScore = 0;
        for(int i =0; i < a.size(); i++) {
        	if(a.get(i) > b.get(i)) {
        		aliceScore += 1;
        	} else if(a.get(i) < b.get(i)) {
        		bobScore += 1;
        	}
        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}
