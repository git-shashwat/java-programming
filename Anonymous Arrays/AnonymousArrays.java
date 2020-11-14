public class AnonymousArrays {
	public static void ins(int [] a) {
		for(int i = 1; i < 5; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = key;
		}
		for(int i = 0; i <= 4; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main (String[] args) {
		System.out.println("Unsorted array is: {4, 3, 5, 2, 1}\n");
		System.out.println("Sorted array is: ");
		AnonymousArrays ob = new AnonymousArrays();
		ob.ins(new int[] {4, 3, 2, 1, 5});
	}
}
