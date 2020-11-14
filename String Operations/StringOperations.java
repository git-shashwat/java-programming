public class StringOperations {
	public static void main (String args[]) {
		String str1 = new String("Hello");
		System.out.println(str1.charAt(2));
		System.out.println("Concat Method: " + str1.concat("World"));
		System.out.println("Substring Mehod: " + str1.substring(0, 4));
		System.out.println("toLowerCase Method: " + str1.toLowerCase());
		System.out.println("toUpperCase Method: " + str1.toUpperCase());
		String str2 = new String("Hello");
		String str3 = new String("Hi");
		System.out.println("str1 equals to str2: " + str1.equals(str2));
		System.out.println("str1 equals to str3: " + str1.equals(str3));
		String str4 = new String("HELLO");
		System.out.println("str1 equals to str4: " + str1.equalsIgnoreCase(str4));
		int index = str4.lastIndexOf('L');
		System.out.println("lastIndexOf Method: " + index);
		str4 = str4.replace('L', 'P');
		System.out.println("String after replacing all 'L' with 'P': " + str4);
		String str = new String("   Hello World   ");
		System.out.println("String after trim: " + str.trim());
	}
}
