/**
 * 
 */
package funPark.attraction;

public class AttractionNotVisitedException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public AttractionNotVisitedException( )
	{
	super();
	}
	public AttractionNotVisitedException( String msg )
	{
	super(msg);
	}
}
