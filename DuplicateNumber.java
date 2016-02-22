/*
You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the index is equals to sum of numbers succeeding the index. 
*/

class FindMiddleIndex{
    
    public static void main(String args){
        int [] input = {1,2,8,6,3,1,1};
        printMiddleIndex(input);
    }
    
    public static void printMiddleIndex(int[] input){
        int first = 0;
        int last = input.length-1;
        int sumLeft = 0;
        int sumRight = 0;
        
        while(true){
            
            if(sumLeft < sumRight)
                sumLeft += input[first++];
            else
                sumRight += input[last--];
            
            if(first > last){
                if(sumLeft == sumRight)
                    System.out.println(first-1);
                else
                    System.out.println("No such index possible with this array");
                break;
            }
        }
    }
    
}