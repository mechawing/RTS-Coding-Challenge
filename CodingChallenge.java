
public class CodingChallenge {

	public static void main (String args[]) { 
		int [] testArray = {3, 5, 44, 78, 12, 22, 1, 40, 6};
		int [] exampleArray = {1, 5, 2, 1, 10};
		
		printAboveAndBelow(testArray, 2); // My own test.
		printAboveAndBelow(exampleArray, 6); // Given example in the exercise.
		
		System.out.println(rotateString("ExampleStr", 4)); // My own test.
		System.out.println(rotateString("MyString", 2)); // Given example in the exercise.
	}
	
	// Problem #1
	public static void printAboveAndBelow (int [] array, int comparisonValue)  { 
		int above = 0;
		int below = 0;
		
		for (int i = 0; i < array.length; i++ ) { 
			
			if (array[i] > comparisonValue) { 
				above++; 
			}
			
			if (array[i] < comparisonValue) { 
				below++;
			}
			
		}
	
		System.out.println("above: " + above + ", below: " + below);
		return; // The exercise did not specify what to do with values equal to the comparison value.
	}
	
	// Problem #2
	public static String rotateString(String str, int rotationValue) { 
		String newStr = (str.substring(str.length() - rotationValue)) + (str.substring(0, str.length() - rotationValue));
		return newStr; // This new string is returned as it contains the rotated string.
	}
	
	/* Problem #3 
	 * 	Personally, I would really like it if Java supported multiple line strings.
	 * 	It would be much more convenient if a block of text like this one could be stored that way.
	 *	Then we'd be able to have paragraphs stored in a variable while coding in Java.
	 */
	
}
