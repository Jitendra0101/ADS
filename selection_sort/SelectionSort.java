package selection_sort;

public class SelectionSort {
	public static void sort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 7, 8, 1, 5, 6 };
		sort(arr);
		System.out.println("sorted array");
		for (int i : arr)
			System.out.print(+i + " ");

	}
}