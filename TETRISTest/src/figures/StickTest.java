package figures;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>StickTest</code> contains tests for the class <code>{@link Stick}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:30
 * @author sony
 * @version $Revision: 1.0 $
 */
public class StickTest {
	/**
	 * Run the Stick(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:30
	 */
	@Test
	public void testStick_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		Stick result = new Stick(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.getSize());
		assertEquals(1, result.getPosX());
		assertEquals(1, result.getPosY());
	}

	/**
	 * Run the void rotation(boolean) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:30
	 */
	@Test
	public void testRotation_1()
		throws Exception {
		Stick fixture = new Stick(1, 1);
		fixture.posX = 1;
		fixture.posY = 1;
		boolean sens = true;

		fixture.rotation(sens);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/04/16 15:30
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
	 * @generatedBy CodePro at 14/04/16 15:30
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
	 * @generatedBy CodePro at 14/04/16 15:30
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(StickTest.class);
	}
}