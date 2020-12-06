import java.io.*; 

public class IoRead 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		File file = new File("./IoRead.txt"); 
		FileInputStream fileStream = new FileInputStream(file); 
		InputStreamReader input = new InputStreamReader(fileStream); 
		BufferedReader reader = new BufferedReader(input); 
		
		String line; 
		
		int characterCount = 0; 
		
		while((line = reader.readLine()) != null) 
		{ 
				characterCount += line.length(); 
		} 
		
		System.out.println("Total number of characters = " + characterCount);  
	} 
} 

