package network;

import org.junit.*;
import views.ConnectFrame;
import static org.junit.Assert.*;
import components.Game;
import components.NextPiece;
import views.ServeurFrame;

/**
 * The class <code>ServeurTest</code> contains tests for the class <code>{@link Serveur}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:26
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ServeurTest {
	/**
	 * Run the Serveur(ServeurFrame) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testServeur_1()
		throws Exception {
		ServeurFrame serveurFrame = new ServeurFrame(new ConnectFrame(new Game(1, 1, new NextPiece()), ""));

		Serveur result = new Serveur(serveurFrame);

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testRun_1()
		throws Exception {
		Serveur fixture = new Serveur(new ServeurFrame(new ConnectFrame(new Game(1, 1, new NextPiece()), "")));

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testRun_2()
		throws Exception {
		Serveur fixture = new Serveur(new ServeurFrame(new ConnectFrame(new Game(1, 1, new NextPiece()), "")));

		fixture.run();

		// add additional test code here
	}

	/**
	 * Run the void run() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testRun_3()
		throws Exception {
		Serveur fixture = new Serveur(new ServeurFrame(new ConnectFrame(new Game(1, 1, new NextPiece()), "")));

		fixture.run();

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ServeurTest.class);
	}
}