/**
 * @author Karim Ibrahim
 * Class for making of version strings which holds a parameterized constructor and a method for comparison.
 *
 */
public class Version {
	
	
	String version;
	
	/**
	 * Parameterized constructor for checking version string validity.
	 * @param version
	 */
	public Version(String version) {
		if(version == null) {
			throw new IllegalArgumentException("Version must not be null.");
		}
		if(!version.matches("[0-9]+(\\.[0-9]+)*")) {
			throw new IllegalArgumentException("Version format invalid.");
		}
		this.version = version;
	}

	/**
	 * Accessor method for version strings.
	 * @return version string associated with object.
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Method used for comparing two version strings. Returns 1 if first version string passed is greater than second. Return -1 if
	 * second version string is greater than first. Finally, returns 0 if equal. 3.090 and 3.09 are NOT equal using this method.
	 * 
	 * Method throw NullVersionException if null version string is passed.
	 * @param first
	 * @param second
	 * @return
	 * @throws NullVersionException
	 */
	public static int compare(Version first, Version second) throws NullVersionException{
		
		if(first == null || second == null) {
			throw new NullVersionException();
		}
		
		String[] firstVersion = first.version.split("\\.");
		String[] secondVersion = second.version.split("\\.");
		
		
		int n = Math.max(firstVersion.length, secondVersion.length);
		
		for(int i = 0; i < n; i++) {
			
			int v1 = 0, v2 = 0;
			
			if(i < firstVersion.length) {
				v1 = Integer.parseInt(firstVersion[i]);
			}
			if(i < secondVersion.length) {
				v2 = Integer.parseInt(secondVersion[i]);
			}
			
			if(v1 > v2) return 1; //Version 1 greater than version 2
			
			if(v2 > v1) return -1; //Version 2 greater than version 1
		}
		return 0; // The two Version are equal
	}
	
	
}


