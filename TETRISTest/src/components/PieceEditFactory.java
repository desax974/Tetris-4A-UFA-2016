package components;



/**
 * The class <code>PieceEditFactory</code> implements static methods that return instances of the class <code>{@link PieceEdit}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class PieceEditFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private PieceEditFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link PieceEdit}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static PieceEdit createPieceEdit() {
		return new PieceEdit(0, new Game(0, 0, NextPieceFactory.createNextPiece()));
	}


	/**
	 * Create an instance of the class <code>{@link PieceEdit}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static PieceEdit createPieceEdit2() {
		return new PieceEdit(1, new Game(1, 1, (NextPiece) null));
	}
}