public class Sorting {
	static void bubbleSort (int [] arr) {
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; ++i) {
			int j = i;
			while (j > 0) {
				if (arr[j-1] > arr[j]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				j--;
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {3, 60, 35, 2, 45, 32, 5};
		System.out.println("Array before sorting: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.println(arr[i] + " ");
		System.out.println();
		bubbleSort(arr);
		
		System.out.println("Array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
}

