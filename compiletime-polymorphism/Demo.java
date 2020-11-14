class SimpleCalculator
{
    int add(int a, int b)
    {
         return a+b;
    }
    int  add(int a, int b, int c)  
    {
         return a+b+c;
    }
    public void add (float x, float y) {
    	System.out.println(x + y);
    }
}

public class Demo
{
   public static void main(String args[])
   {
       SimpleCalculator obj = new SimpleCalculator();
       System.out.println(obj.add(10, 20));
       System.out.println(obj.add(10, 20, 30));
       obj.add(10.0f, 20.0f);
   }
}
