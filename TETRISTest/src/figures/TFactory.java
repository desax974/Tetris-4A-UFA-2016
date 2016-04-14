package figures;



/**
 * The class <code>TFactory</code> implements static methods that return instances of the class <code>{@link T}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class TFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private TFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link T}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static T createT() {
		return new T(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link T}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static T createT2() {
		return new T(1, 1);
	}
}