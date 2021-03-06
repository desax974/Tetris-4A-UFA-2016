package figures;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>SquareTest</code> contains tests for the class <code>{@link Square}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:26
 * @author sony
 * @version $Revision: 1.0 $
 */
public class SquareTest {
	/**
	 * Run the Square(int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testSquare_1()
		throws Exception {
		int posX = 1;
		int posY = 1;

		Square result = new Square(posX, posY);

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.getSize());
		assertEquals(1, result.getPosX());
		assertEquals(1, result.getPosY());
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
		new org.junit.runner.JUnitCore().run(SquareTest.class);
	}
}