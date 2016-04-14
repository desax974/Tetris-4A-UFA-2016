package network;



/**
 * The class <code>ClientFactory</code> implements static methods that return instances of the class <code>{@link Client}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ClientFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private ClientFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Client}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Client createClient() {
		return new Client();
	}
}