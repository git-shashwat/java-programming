 import java.io.*; 

class Demo implements java.io.Serializable 
{ 
	public int a; 
	public String b; 

	public Demo(int a, String b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

} 

class Test 
{ 
	public static void main(String[] args) 
	{ 
		Demo object = new Demo(1, "serializationFile"); 
		String filename = "file.ser"; 
		
		try
		{ 
			FileOutputStream file = new FileOutputStream(filename); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			out.writeObject(object); 
			
			out.close(); 
			file.close(); 
			
			System.out.println("Object has been serialized"); 

		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		}

	} 
} 

