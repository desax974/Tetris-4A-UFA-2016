package views;



/**
 * The class <code>ServeurFrameFactory</code> implements static methods that return instances of the class <code>{@link ServeurFrame}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ServeurFrameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private ServeurFrameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ServeurFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static ServeurFrame createServeurFrame() {
		return new ServeurFrame(ConnectFrameFactory.createConnectFrame());
	}
}