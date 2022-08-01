package assign;
import java.io.File;
public class FileCreation {
	
		public static void main(String[] args) {
			try{
			File f=new File("Demofile.txt");
			
			if(f.createNewFile())
			{
				System.out.println("File is created!!!");
			}
			else
			{
				if(f.exists())
				{
					System.out.println("File is already exists...");
					System.out.println(f.getName());
					System.out.println(f.getAbsolutePath());
					System.out.println(f.getFreeSpace());
					System.out.println(f.getParent());
					System.out.println(f.getClass());
					System.out.println(f.getUsableSpace());
					
				}
				boolean b=f.delete();
				if(b)
				{
					System.out.println("file is deleted");
				}
				else
				{
					System.out.println("file is not deleted");
				}
				}
			}
			
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally{
				System.out.println("Program executed successfully");
			}

		}

	}

