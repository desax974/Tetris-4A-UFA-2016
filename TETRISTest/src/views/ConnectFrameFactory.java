package views;

import components.GameFactory;


/**
 * The class <code>ConnectFrameFactory</code> implements static methods that return instances of the class <code>{@link ConnectFrame}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ConnectFrameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private ConnectFrameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link ConnectFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static ConnectFrame createConnectFrame() {
		return new ConnectFrame(GameFactory.createGame(), "");
	}


	/**
	 * Create an instance of the class <code>{@link ConnectFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static ConnectFrame createConnectFrame2() {
		return new ConnectFrame(GameFactory.createGame2(), "0123456789");
	}
}