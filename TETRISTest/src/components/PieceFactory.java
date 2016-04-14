package components;



/**
 * The class <code>PieceFactory</code> implements static methods that return instances of the class <code>{@link Piece}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class PieceFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private PieceFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Piece}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Piece createPiece() {
		return new Piece(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Piece}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Piece createPiece2() {
		return new Piece(1, 1);
	}
}