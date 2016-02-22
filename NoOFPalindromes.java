import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        calculateNoOfPalindromes(input);
    }
    
    public static void calculateNoOfPalindromes(String input){
        int i,j,cnt = 0;
        List<String> str=new ArrayList<String>();
        
        for(i=0; i< input.length(); i++){
            for(j=i+1; j<=input.length(); j++){
                String temp = input.substring(i,j);
                String outputFromChkPal = checkPalindrome(temp);
                if(outputFromChkPal != null){
                    if(!str.contains(outputFromChkPal))
                        str.add(outputFromChkPal);
                }
            }
        }        
        System.out.println(str.size());
    }
    
    public static String checkPalindrome(String temp){
        int i = 0;
        int j = temp.length() -1;
        while(i<j){
            if(temp.charAt(i) != temp.charAt(j))
                return null ;
            i++;
            j--;
        }
        return temp;
    }
}