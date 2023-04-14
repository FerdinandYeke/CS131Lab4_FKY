import java.io.IOException;
import java.util.*;
public class GoodString_StringName {

	public static void main(String[] args)throws IOException, StringTooLongException {
		// TODO Auto-generated method stub
		
		FileProcessor fp = new FileProcessor("GoodString.txt",10);
		
		FileProcessor fp2 = new FileProcessor("StringName.txt",0);
		System.out.println("GoodString: ");
		fp.processFile();
		System.out.println("");
		System.out.println("StringName: ");
		fp2.processFile();
		
		
	}

}
