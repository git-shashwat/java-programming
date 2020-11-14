import myPackage.Compare;

public class MaxPrint {	
	public static void main(String[] args) {
		Compare current[] = new Compare[2];
		current[0] = new Compare(5, 10);
		current[1] = new Compare(123, 120);
		for (int i = 0; i < 3; i++) {
			current[i].getMax();
		}
	}
}
