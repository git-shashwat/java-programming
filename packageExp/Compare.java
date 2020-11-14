package packageExp;
public class Compare {
	int num1, num2;
	Compare (int n, int m) {
		num1 = n;
		num2 = m;
	}
	public void getMax() {
		if (num1 > num2)
			System.out.println("Maximum value of two numbers is: " + num1);
		else
			System.out.println("Maximum value of two numbers is: " + num2);		
	}
}
