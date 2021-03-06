package figures;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>STest</code> contains tests for the class <code>{@link S}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:30
 * @author sony
 * @version $Revision: 1.0 $
 */
public class STest {
	/**
	 * Run the S(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:30
	 */
	@Test
	public void testS_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		S result = new S(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(3, result.getSize());
		assertEquals(1, result.getPosX());
		assertEquals(1, result.getPosY());
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
		new org.junit.runner.JUnitCore().run(STest.class);
	}
}