package components;



/**
 * The class <code>StarterFactory</code> implements static methods that return instances of the class <code>{@link Starter}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class StarterFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private StarterFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Starter}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Starter createStarter() {
		return new Starter();
	}
}