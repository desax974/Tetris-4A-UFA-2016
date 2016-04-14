package figures;



/**
 * The class <code>SFactory</code> implements static methods that return instances of the class <code>{@link S}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class SFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private SFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link S}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static S createS() {
		return new S(0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link S}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static S createS2() {
		return new S(1, 1);
	}
}