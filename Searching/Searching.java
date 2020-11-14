public class Searching {
	static int linearSearch (int [] arr, int key) {
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 60, 90};
		int key = 60;
		System.out.println(key + " is found at index: " + linearSearch(arr, key));
	}
}

