public class StringAndStringBufferOps {
  public static void main(String[] args) {
    String str1 = new String(" Maharaja Surajmal Institute of Technology ");
    System.out.println(" String Class Functions");
    System.out.println("SubString Method: " + str1.substring(0, 28));
    str1 = str1.replace('M', 'm');
    System.out.println("String after replacing all 'L' with 'P' : " + str1);
    String str2 = new String("         Maharaja Surajmal Institute of Technology      ");
    System.out.println("String after trim: " + str2.trim());
    StringBuffer strb = new StringBuffer("Maharaja Surajmal Institute of Technology");
    System.out.println(" StringBuffer Class Functions");
    System.out.println(" Length function: " + strb.length());
    strb.setCharAt(8, '&');
    strb.setCharAt(17, '&');
    System.out.println(" setCharAt function: " + strb);
    System.out.println(" reverse function: " + strb.reverse());
  }

}
