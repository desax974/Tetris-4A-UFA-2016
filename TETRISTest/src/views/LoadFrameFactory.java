package views;


import components.PieceEditFactory;


/**
 * The class <code>LoadFrameFactory</code> implements static methods that return instances of the class <code>{@link LoadFrame}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class LoadFrameFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private LoadFrameFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link LoadFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static LoadFrame createLoadFrame() {
		return new LoadFrame("", PieceEditFactory.createPieceEdit());
	}


	/**
	 * Create an instance of the class <code>{@link LoadFrame}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static LoadFrame createLoadFrame2() {
		return new LoadFrame("0123456789", PieceEditFactory.createPieceEdit2());
	}
}