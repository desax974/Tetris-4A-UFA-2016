package figures;



/**
 * The class <code>SquareFactory</code> implements static methods that return instances of the class <code>{@link Square}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class SquareFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private SquareFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Square}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Square createSquare() {
		return new Square(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Square}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Square createSquare2() {
		return new Square(1, 1);
	}
}