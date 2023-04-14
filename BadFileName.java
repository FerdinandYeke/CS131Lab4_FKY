import java.io.IOException;
import java.util.*;
//IO TestClass for bad file names
public class BadFileName{
  
  public static void main(String[] args) throws IOException, StringTooLongException{
    
    FileProcessor fp = new FileProcessor("String1.txt",10);
    	System.out.println(fp.getArrayListSize());
		fp.processFile();
  }//end main
  
}//end class