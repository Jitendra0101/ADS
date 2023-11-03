package bubble_sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {7,6,5,4,3,2};
		
		int n = arr.length, temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}				
			}
		}
		
		System.out.println("Sorted array by Bubble Sort");
		for(int i = 0 ; i < n ; i++)
			System.out.print(arr[i] + " ");
		
	}

}
