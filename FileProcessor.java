import java.util.*;
import java.io.*;


public class FileProcessor {

	private String fileName;
	private int stringLength;
	private ArrayList<String> stringList = new ArrayList<String>(); ;
	private Scanner input;
	
	public FileProcessor(String fileName, int stringLength) 
	{
		this.fileName = fileName;
		this.stringLength = stringLength;
	}//end empty-argument constructor
	
	public int getArrayListSize() 
	{
		return stringList.size();
		
	}//end getArrayListSize
	
	public void processFile() throws IOException, StringTooLongException 
	{
		input = new Scanner(this.fileName);
		//this is the same as: "System.out.println("Enter file name: ")";
		
		try 
		{
			FileReader inputFile = new FileReader(input.nextLine());//Scans the input by the this.fileName
			BufferedReader BufferReader = new BufferedReader(inputFile);//Reads the inputFile.
			
			//Prints out the File contents by line, using a for loop.
			for(int i = 0; i < stringLength; i++)
			{	
				/*If a word read on a specific line is larger than the string length
				 * then, it throw an StringTooLongException, otherwise, it prints
				 * as normal (else block below does just that).
				*/
				//if(fileName.length() > this.stringLength)
				
				stringList.add(fileName);//Adds the file to the array
				String getElement = stringList.get(i);//gets the element by increments of i.
				//if(stringList.indexOf(i) > stringLength)
				
				if(stringList.indexOf(getElement) > stringLength && BufferReader.read() > stringLength)
				{
					StringTooLongException StringLengthExpetionE = 
					new StringTooLongException("String is too long!");
					throw StringLengthExpetionE;
				}//if Block ends here
				
				//else block starts here
				else
				{
					System.out.println(BufferReader.readLine());
				}//else block ends here
			}//for loop ends here
			
		}//Try block ends here
		
		//catch block for FileNotFoundException starts here
		catch(FileNotFoundException e)
		{
			System.out.println("The file you entered cannot be found.");
		}//catch block for FileNotFoundException ends here
		
		//catch block for StringTooLongException starts here
		catch(StringTooLongException e)
		{
			System.out.println("File string is too long!");
		}//catch block for StringTooLongException ends here
		
		//finally block starts here
		/*This finally block just prints out
		 * that the file search and process has ended, after the
		 * try-catch block above has been executed.
		 */
		finally
		{
			System.out.println("File search and Process ended.");
		}//finally block ends here
		
	}//end processFile

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the stringLength
	 */
	public int getStringLength() {
		return stringLength;
	}//getStringLength method ends here

	/**
	 * @param stringLength the stringLength to set
	 */
	public void setStringLength(int stringLength) 
	{
		this.stringLength = stringLength;
		/*This checks the bound of string length.
		 * If the number passed in is less than 5,
		 * this method will set the stringLength
		 * to 5.
		 */
		if(this.stringLength < 5)
		{
			this.stringLength = 5;
		}
	}//setStringLength ends here
}//end class
