package network;

import components.GameFactory;
import views.ServeurFrame;
import views.ConnectFrame;


/**
 * The class <code>ServeurFactory</code> implements static methods that return instances of the class <code>{@link Serveur}</code>.
 *
 * @generatedBy CodePro at 14/04/16 16:41
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ServeurFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	private ServeurFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Serveur}</code>.
	 *
	 * @generatedBy CodePro at 14/04/16 16:41
	 */
	public static Serveur createServeur() {
		return new Serveur(new ServeurFrame(new ConnectFrame(GameFactory.createGame(), "")));
	}
}