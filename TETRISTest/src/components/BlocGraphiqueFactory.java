package components;

import java.awt.Color;


/**
 * The class <code>BlocGraphiqueFactory</code> implements static methods that return instances of the class <code>{@link BlocGraphique}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class BlocGraphiqueFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private BlocGraphiqueFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link BlocGraphique}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static BlocGraphique createBlocGraphique() {
		return new BlocGraphique(Color.BLACK, 0, 0);
	}


	/**
	 * Create an instance of the class <code>{@link BlocGraphique}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static BlocGraphique createBlocGraphique2() {
		return new BlocGraphique(Color.BLUE, 1, 1);
	}


	/**
	 * Create an instance of the class <code>{@link BlocGraphique}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static BlocGraphique createBlocGraphique3() {
		return new BlocGraphique(Color.CYAN, 7, 7);
	}
}