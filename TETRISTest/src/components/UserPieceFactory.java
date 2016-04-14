package components;



/**
 * The class <code>UserPieceFactory</code> implements static methods that return instances of the class <code>{@link UserPiece}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class UserPieceFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private UserPieceFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link UserPiece}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static UserPiece createUserPiece() {
		return new UserPiece(0, 0, MatrixFactory.createMatrix());
	}


	/**
	 * Create an instance of the class <code>{@link UserPiece}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static UserPiece createUserPiece2() {
		return new UserPiece(1, 1, (Matrix) null);
	}


	/**
	 * Create an instance of the class <code>{@link UserPiece}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static UserPiece createUserPiece3() {
		return new UserPiece(7, 7, (Matrix) null);
	}
}