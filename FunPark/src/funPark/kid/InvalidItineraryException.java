/**
 * 
 */
package funPark.kid;

public class InvalidItineraryException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public InvalidItineraryException( )
	{
	super();
	}
	public InvalidItineraryException( String msg )
	{
	super(msg);
	}
}
