class Superclass
{
   int num = 100;
   
   Superclass(int x) {
   	System.out.println("Super class constructor: " + x);
   }
}

class Subclass extends Superclass
{
   int num = 110;

   Subclass() {
   	super(67);
   	System.out.println("Sub class constructor: 67");
   }

   public static void main(String args[]){
	Subclass obj= new Subclass();	
   }
}
