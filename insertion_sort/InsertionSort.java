package insertion_sort;

public class InsertionSort {
	
	public static void sort(int[] arr) {
		
		int size = arr.length;
		
		for (int i = 1 ; i < size ; i++) {
			
			int key = arr[i];
			int j = i - 1;
			
			while( j >= 0 && arr[j] > key) {
				
				arr[j+1] = arr[j];
				j--;
				
			}
			
			arr[j+1] = key;
			
		}
		
	}
	
	

	public static void main(String[] args) {
		 
		int[] arr = {2,12,4,1,6,5};
		
		sort(arr);
		
		System.out.println("Sorted array is: ");
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		
		
		
		

	}

}
