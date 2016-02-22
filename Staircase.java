/*
*   Staircase (https://www.hackerrank.com/challenges/staircase)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = n-1;
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(j >= count)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            count--;
            System.out.println();
        }
    }
} 


/* Input
*   6
*
*   Output
*     #
*    ##
*   ###
*  ####
* #####
*######
*/
