/**
 * @author Karim Ibrahim
 * 
 * Exception class used for validating version strings passed to the comparison method.
 *
 */
public class NullVersionException extends Exception{

	/**
	 * Default constructor for NullVersionException.
	 */
	public NullVersionException() {
		super("Version passed cannot be null.");
	}
	
	
}
