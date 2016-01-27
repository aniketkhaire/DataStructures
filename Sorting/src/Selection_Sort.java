
public class Selection_Sort {
	public static void main(String args[]){
		int[] a = {5,7,3,9,25,76,14,6};
		
		System.out.print("Array before sorting: ");
		display(a);
		selection_sort(a);
		System.out.print("Array after sorting: ");
		display(a);
	}
	
	public static void display(int[] a){
		for(int i=0; i<a.length;i++)
			System.out.print("\t" + a[i]);
		System.out.println();
	}
	
	public static void selection_sort(int[] a){
		
		for(int i=0; i<a.length;i++){
			int min_index = i;
			for(int j=i+1; j<a.length;j++){
				if(a[j] < a[min_index]){
					min_index = j;
				}
			}
			if(i != min_index){
				int temp = a[i];
				a[i] = a[min_index];
				a[min_index] = temp;
			}
			System.out.print("Iteration: "+i+"|\t");
			display(a);
		}
	}
}
