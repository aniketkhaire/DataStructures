/*
*   Ann and Jimmy (https://www.hackerrank.com/contests/hourrank-5/challenges/ann-jimmy/submissions/code/5004075)
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        // your code goes here
        int first, second, third;
        if(N%3 == 2){
            first = second = N/3 + 1;
            third = N/3;
        }else if(N%3 == 1){
            first = N/3 + 1;
            third =second = N/3;
        }else{
            first = second = third = N/3;
        }
        
        System.out.println(first*second*third);
    }
}
