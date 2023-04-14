import java.io.IOException;
import java.util.Scanner;

public class BadString{
  
  public static void main(String[] args) throws IOException, StringTooLongException{
    	
    	FileProcessor fp = new FileProcessor("BadString.txt",23);
    	System.out.println(fp.getArrayListSize());
		fp.processFile();
    
  }//end main
  
}//end class