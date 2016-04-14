package figures;



/**
 * The class <code>StickFactory</code> implements static methods that return instances of the class <code>{@link Stick}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class StickFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private StickFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Stick}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Stick createStick() {
		return new Stick(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link Stick}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Stick createStick2() {
		return new Stick(1, 1);
	}
}