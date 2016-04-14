package components;



/**
 * The class <code>MonCanvasFactory</code> implements static methods that return instances of the class <code>{@link MonCanvas}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class MonCanvasFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private MonCanvasFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link MonCanvas}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static MonCanvas createMonCanvas() {
		return new MonCanvas(new Tetris());
	}
}