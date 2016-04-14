package components;



/**
 * The class <code>MatrixFactory</code> implements static methods that return instances of the class <code>{@link Matrix}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class MatrixFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private MatrixFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Matrix}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Matrix createMatrix() {
		return new Matrix(0);
	}
}