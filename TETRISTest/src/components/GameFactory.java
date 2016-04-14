package components;



/**
 * The class <code>GameFactory</code> implements static methods that return instances of the class <code>{@link Game}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class GameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private GameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Game createGame() {
		return new Game(0, 0, NextPieceFactory.createNextPiece());
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Game createGame2() {
		return new Game(1, 1, (NextPiece) null);
	}


	/**
	 * Create an instance of the class <code>{@link Game}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Game createGame3() {
		return new Game(7, 7, (NextPiece) null);
	}
}