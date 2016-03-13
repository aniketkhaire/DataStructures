/**
 * 
 * @author Aniket Khaire
 * Problem: Rotate an array of n elements to the right by k steps. 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
 * How many different ways do you know to solve this problem?
 *
 */
public class RotateArray {

	public static void rotateArray(int []arr, int k){
	
		//for cases where k is greater than array length
		int n = k%arr.length -1;
		
		//divide array into two parts		
		//reverse the first part			[2	1 | 3	4	5	6	7]
		for(int i=0,  j=n; i<j; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		//reverse the second array			[2	1 | 7	6	5	4	3]
		for(int i=n+1,  j=arr.length -1; i<j; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		//reverse the entire array			[3	4	5	6	7	1	2]
		for(int i=0,  j=arr.length -1; i<j; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArr[] = {1,2,3,4,5,6,7};
		int k = 1;
		
		System.out.print("Array before rotation: \t\t");
		for(int element:myArr){
			System.out.print(element+"\t");
		}
		System.out.println();
		
		rotateArray(myArr, k);
		
		System.out.print("Array after rotating by "+k+": \t");
		for(int element:myArr){
			System.out.print(element+"\t");
		}
	}

}
