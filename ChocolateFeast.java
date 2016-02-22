/*
*   Chocolate Feast (https://www.hackerrank.com/challenges/chocolate-feast)
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            printNoOfChocolates(n, c, m);
        }
    }
    
    public static void printNoOfChocolates(int n, int c, int m){
        int total = n/c;
        int wrappers = total;
        
        while(wrappers/m != 0){
            total += (wrappers/m);
            wrappers = (wrappers%m) + (wrappers/m);
        }
        
        System.out.println(total);
    }
}









// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack <Integer>st = new Stack<Integer>();
        
        //1. if length > 200000
        if(S.length() > 200000)
            return -1;
        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);    
            
            if(temp >= '0' && temp <='9')
                st.push((int)(temp - '0'));
            else if(st.size() >=2){
                if(temp == '+'){
                    long sum = (long)st.pop() + st.pop();
                    if(sum > Integer.MAX_VALUE)
                        return -1;                          //3. if overflow
                    st.push((int)sum);
                }
                else if(temp == '*'){
                    long sum = (long)st.pop() * st.pop();
                    if(sum > Integer.MAX_VALUE)
                        return -1;                          //3. if overflow
                    st.push((int)sum);
                }
                else
                    return -1;                              //4. if other char encountered
            }
            //2. if underflow
            else return -1;
        }
        if(st.size() == 1)
            return(st.pop());
        else
            return -1;                                      //5. if value remains
    }
}


















