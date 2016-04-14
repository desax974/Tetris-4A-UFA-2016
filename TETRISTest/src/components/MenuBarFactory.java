package components;



/**
 * The class <code>MenuBarFactory</code> implements static methods that return instances of the class <code>{@link MenuBar}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class MenuBarFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private MenuBarFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link MenuBar}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static MenuBar createMenuBar() {
		return new MenuBar(new Tetris());
	}
}