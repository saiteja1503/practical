package oppspractical;
import java.util.Scanner;

public class bitwiseoperators {


		   public static void main(String args[]) {
		      int a = 60;	/* 60 = 0011 1100 */
		      int c = 0;

		      c = a << 2;       /* 240 = 1111 0000 */
		      System.out.println("a << 2 = " + c );

		      c = a >> 2;       /* 15 = 1111 */
		      System.out.println("a >> 2  = " + c );

		      c = a >>> 2;      /* 15 = 0000 1111 */
		      System.out.println("a >>> 2 = " + c );
		   }


}
