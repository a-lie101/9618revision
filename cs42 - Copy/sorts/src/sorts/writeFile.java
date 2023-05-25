package sorts;
import java.io.*;

public class writeFile {
	public static void main(String args[]) {
		writeFile();
		
	}
	
	public static void writeFile() {
		try {
			
			String s = "added";
			File x = new File("created.txt");
			FileWriter f = new FileWriter(x);
			
			f.write(s);		
			
			f.close();
		} catch (IOException e) {
			System.exit(-1);
		}
	}
}
