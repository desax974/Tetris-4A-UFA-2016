package components;



/**
 * The class <code>TetrisFactory</code> implements static methods that return instances of the class <code>{@link Tetris}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class TetrisFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private TetrisFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Tetris}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Tetris createTetris() {
		return new Tetris();
	}
}