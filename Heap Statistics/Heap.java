public class Heap {
	public static void main(String[] args) {
		long mb = 1024 * 1024;
		Runtime r = Runtime.getRuntime();
		System.out.println("Max memory space: " + r.maxMemory() / mb);
		System.out.println("Total memory space: " + r.totalMemory() / mb);
		System.out.println("Free memory: " + r.freeMemory() / mb);
		System.out.println("Consumed memory space: " + (r.totalMemory() + r.freeMemory()) / mb);
	}
}
