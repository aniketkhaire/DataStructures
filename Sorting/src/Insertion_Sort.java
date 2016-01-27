
public class Insertion_Sort {
	public static void main(String args[]){
		int[] a = {5,7,3,9,25,76,14,6};
		
		System.out.print("Array before sorting: ");
		display(a);
		insertion_sort(a);
		System.out.print("Array after sorting: ");
		display(a);
	}
	
	public static void display(int[] a){
		for(int i=0; i<a.length;i++)
			System.out.print("\t" + a[i]);
		System.out.println();
	}
	
	public static void insertion_sort(int a[]){
		for(int i=1; i<a.length;i++){
			for(int j=i; j > 0; j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
			System.out.print("Iteration: "+i+"|\t");
			display(a);
		}
	}
}
