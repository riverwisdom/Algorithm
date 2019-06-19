package algo1152;

import java.io.IOException;
import java.util.Scanner;

/**
 * <pre>
 * desc : 1152, 단어의 개수
 * </pre>
 * @author kang.ji.hye
 * @since 2019. 6. 19. 오후 10:44:46
 * @version 1.0.0 
 * @history
 *	-----------------------------------------------------------------------
 *	변경일				작성자						변경내용  
 *	----------- ------------------- ---------------------------------------
 *	2019. 6. 19.		kang.ji.hye				최초 작성 
 *	-----------------------------------------------------------------------
 */
public class Main {
	
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        sc.close();
         
        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
	}

}
