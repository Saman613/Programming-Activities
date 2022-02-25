package countingDuplicateCharacters;

import java.util.Set;// this models the mathematical set abstraction
import java.util.Map;// It maps keys to became a value
import java.util.HashMap;// It provides all of the optional map operations and
						// null values null key

public class CountingDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			
			String textars="Samantha Jane Samantha Jane Samantha Jane Morales Morales Doctor Doctor Doctor";// String is the class where in it represent character strings
																											//textars is my identifier to the string, which is also the words inside
																											//quote
			
			String textars1= textars.toLowerCase(); //to make a string case insensitive. the "toLowerCase" function is to make the String textars to be converted into
												   //LowerCase in when runs at the console
			String string2[]=textars1.split("[(' '),.-]"); //it evokes arguments which is the textars to split by means of trailing empty strings
														  //"[(' '),.-]" is a empty string
			
			HashMap<String, Integer> uniques =new HashMap<String, Integer>(); //This implementation provides constant-time performance for the basic operations (get and put), 
																			//assuming the hash function disperses the elements properly
			for (String word : string2) //conditional statements
				{
					
					if (word.length() <= 2) //to words that are that has more than two letters, word.length refers textars length
											//<=, this java equality or relational operator means x is less than or equal y
											//so it means, if textars length is less than or equal to 2
					{
						continue; //it can be initialize as then because I am using conditional statement which is if, then
					}
				Integer existingCount = uniques.get(word); //implementation of get and put which refers to the HashMap that we are using
				uniques.put(word, (existingCount == null ? 1 : (existingCount + 1)));// existingCount is an identifier to identify the Integer 
				}																	// since were using a HashMap which is similar to HashTable then it is in the form of an list
																					//wherein we use Integer existingCount to know the existing count of the words inside the String textars
																					//the HashMap allows the null to have a value since in HashTable the null is unorganized or unsynchronized
																					// so this implementation means that the existing count of the word inside the textars is equal to null
																					//wherein the existingCount which is null will must be added 1
			
			//it means that if textars length is less than or equal to 2 then the existing count of the textars is equal to null wherein it will be added value of 1
				
				Set<Map.Entry<String, Integer>> uniqueSet = uniques.entrySet(); // Since map only identify one value then the duplicated words inside the map will be counted as 1
																				// Since we have the implementation to add the value of textars using If, then conditions, the word inside
																				//textars will be added a value
		
				for (Map.Entry<String, Integer> entry : uniqueSet)
				{
				
						if (entry.getValue() > 1)
						{
									System.out.println(entry.getKey()+" "+entry.getValue()); // this explains to get the Value of the duplicated Words inside the String textars
						}
						}
				
				
					}
	}
	}


