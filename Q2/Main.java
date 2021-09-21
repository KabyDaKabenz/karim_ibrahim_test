/**
 * @author Karim Ibrahim
 * 
 * Program for comparing two version strings. The program takes in two version strings and shows which one is greater or tests for equality.
 * The program doesn't support the passing of null values to the compare method as they are not valid version strings.
 *
 */
public class VersionStringCompare {
	
	public static void main(String[] args) {
		
		int result = -4;
		int counter = 1;
		
		/* TEST 1 */ 
		Version version1 = new Version("1.0");
		Version version2 = new Version("1");
		
		try {
			
			result = Version.compare(version1, version2);
		
		} catch(NullVersionException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Program will terminate");
			System.exit(0);	
			
		}
		
		System.out.print(counter++ + ") ");
		stringifyResult(result);
		
		/* Test 2 */
		version1 = new Version("3.0");
		version2 = new Version("2.9.9");
		
		
		
		try {
			
			result = Version.compare(version1, version2);
		
		} catch(NullVersionException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Program will terminate");
			System.exit(0);	
			
		}
		
		System.out.print(counter++ + ") ");
		stringifyResult(result);

		
		/* TEST 3 */ 
		 version1 = new Version("2.2");
		 version2 = new Version("2.2.2");
		
		try {
		
			result = Version.compare(version1, version2);
		
		} catch(NullVersionException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Program will terminate");
			System.exit(0);	
			
		}
		
		System.out.print(counter++ + ") ");
		stringifyResult(result);
		
		/* TEST 4 */ 
		
		
		version1 = new Version("3.090");
		version2 = new Version("3.09");
		
		try {
		
			result = Version.compare(version1, version2);
		
		} catch(NullVersionException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Program will terminate");
			System.exit(0);	
			
		}
		
		System.out.print(counter++ + ") ");
		stringifyResult(result);
		
		
		/* TEST 5 */ 
		 version1 = new Version("2.2.2");
		 version2 = new Version("2.2");
		
		try {
		
			result = Version.compare(version1, null);
		
		} catch(NullVersionException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Program will terminate");
			System.exit(0);			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	/**
	 * This method takes the integer resulting from the comparison and interprets it for better readability for the user.
	 * @param result the integer resulting from the comparison.
	 */
	public static void stringifyResult(int result) {
		
		if(result > 0) {
			System.out.println("Version 1 is greater than Version 2");
		} else if(result < 0) {
			System.out.println("Version 2 is greater than Version 1");
		} else {
			System.out.println("The two Versions are the same.");
		}
	}
	
	

}
