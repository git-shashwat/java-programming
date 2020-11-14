public class StringBufferOperations {
	public static void main (String [] args) {
		StringBuffer sb = new StringBuffer("Shashwat");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("Tyagi");
		System.out.println(sb);
		sb.insert(8, " ");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(0, 9);
		System.out.println(sb);
		sb.reverse();
		sb.replace(1, 3, "HA");
		System.out.println(sb);
		System.out.println(sb.indexOf("H"));
		System.out.println(sb.substring(1, 3));
	}
}
