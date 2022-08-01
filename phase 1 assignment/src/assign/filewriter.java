package assign;
import java.io.File;
import java.io.FileWriter;
public class filewriter {
	public static void main(String args[]) {
		String name= "R3 is in Mphasis";
		try{
			FileWriter output = new FileWriter("a://Users//R3//Downloads//R3n"+ "");
		
		    output.write(name);
		    
		     System.out.println("Data is written to the file.");

	     
	      output.close();
		
		}	
		catch (Exception e) {
		      e.getStackTrace();
		    }
	}
}

