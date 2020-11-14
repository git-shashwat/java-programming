public class Ref {
	static int i = 5;
	int a = 10;
	boolean b;
	void func() {
		System.out.println(i);
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String [] args) {
		Ref r = new Ref();
		System.out.println(r.i);
		System.out.println(r.a);
		System.out.println(r.b);
		r.func();
		System.out.println("Static Vairables");
		System.out.println(i);
		System.out.println(r.i);
		System.out.println(Ref.i);
	}
}

