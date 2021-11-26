package main;

/**
 * <p>EmptyCompetitorListException class.</p>
 *
 * @author legeek
 * @version $Id: $Id
 */
public class EmptyCompetitorListException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * <p>Constructor for EmptyCompetitorListException.</p>
     *
     * @param msg a {@link java.lang.String} object.
     */
    public EmptyCompetitorListException(String msg){
        super(msg);
    }
}
