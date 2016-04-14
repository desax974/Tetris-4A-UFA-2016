package views;

import components.Matrix;
import components.MatrixFactory;


/**
 * The class <code>SaveFrameFactory</code> implements static methods that return instances of the class <code>{@link SaveFrame}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class SaveFrameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private SaveFrameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link SaveFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static SaveFrame createSaveFrame() {
		return new SaveFrame("", MatrixFactory.createMatrix());
	}


	/**
	 * Create an instance of the class <code>{@link SaveFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static SaveFrame createSaveFrame2() {
		return new SaveFrame("0123456789", (Matrix) null);
	}
}