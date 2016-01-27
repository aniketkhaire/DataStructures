//Implementation of Bubble Sort


public class BubbleSort {
	public static void main(String args[]){
		int[] a = {5,7,3,9,25,76,14,6};
		
		System.out.print("Array before sorting: ");
		display(a);
		bubble_sort(a);
		System.out.print("Array after sorting: ");
		display(a);
	}
	
	public static void display(int[] a){
		for(int i=0; i<a.length;i++)
			System.out.print("\t" + a[i]);
		System.out.println();
	}
	
	public static void bubble_sort(int a[]){
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.print("Iteration: "+(a.length - i)+"|\t");
			display(a);
		}
	}
}
