class A
{
		public int A() {
			return 1;
		}
                public void show()
                {
                           System.out.println("java");
                }
}
class Dot
{
               public static void main(String ...args)
               {
                          A a=new A()
                          {
                                    public void show()
                                    {
                                                System.out.println("java Programming");
                                    }
                          };
                          a.show();
               }
}
