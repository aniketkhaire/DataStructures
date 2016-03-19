import java.util.Arrays;

public class HackerRank {
	public static void main(String args[]){
		int[] a = {1,2,5,7,4,1,4,7,5,5};
		System.out.println(findDuplicate(a));
	}
	
	public static int findDuplicate(int[] a){
		int result = 0;
		Arrays.sort(a);						//log(n)
		
		for(int i=1; i<a.length; i++){		//n
			if(a[i] == a[i-1]){
				result++;
				while((a[i] == a[i-1]) && (i<a.length - 1))
					i++;
			}
		}
		return result;
	}
}
