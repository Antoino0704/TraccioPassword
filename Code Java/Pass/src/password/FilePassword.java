package password;

import java.io.*;

public class FilePassword {
	private File fp;
	private FileWriter fw;
	private BufferedWriter fb;
	
	public FilePassword()
	{
		try
		{
			fp = new File("programma//passwordDigitate.txt");
			fw = new FileWriter(fp, true);
			fb = new BufferedWriter(fw);
		}
		catch (IOException e1)
		{
			return;
		}
	}
	
	public void Scrivi(String password)
	{
		String pass = password;
		try
		{
			fb.write(pass);
			fb.close();
		}
		catch (IOException e1)
		{
			return;
		}
		
		
	}
	

}
