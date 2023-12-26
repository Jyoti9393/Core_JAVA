package patternquestions;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * This Program will pattern like below
 5 4 3 2 1
 5 4 3 2
 5 4 3
 5 4
 5
 */

public class Pattern1 {
    //private static final Logger logger = Logger.getLogger(Pattern1.class);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfLinesToPrint=sc.nextInt();
        for (int i =0;i<noOfLinesToPrint;i++){
            for (int j=noOfLinesToPrint;j>i;j--){
                System.out.print(j+" ");

            }
            System.out.println("");
        }
    }
}
