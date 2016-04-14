package components;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CouleurTest</code> contains tests for the class <code>{@link Couleur}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:26
 * @author sony
 * @version $Revision: 1.0 $
 */
public class CouleurTest {
	/**
	 * Run the Couleur() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testCouleur_1()
		throws Exception {

		Couleur result = new Couleur();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the Color getCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetCouleur_1()
		throws Exception {
		int couleur = 3;

		Color result = Couleur.getCouleur(couleur);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=191,g=191,b=191]", result.toString());
		assertEquals(255, result.getAlpha());
		assertEquals(191, result.getGreen());
		assertEquals(191, result.getRed());
		assertEquals(191, result.getBlue());
		assertEquals(-4210753, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the Color getCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetCouleur_2()
		throws Exception {
		int couleur = 0;

		Color result = Couleur.getCouleur(couleur);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=255,g=128,b=128]", result.toString());
		assertEquals(255, result.getAlpha());
		assertEquals(128, result.getGreen());
		assertEquals(255, result.getRed());
		assertEquals(128, result.getBlue());
		assertEquals(-32640, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the Color getCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetCouleur_3()
		throws Exception {
		int couleur = 1;

		Color result = Couleur.getCouleur(couleur);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=128,g=255,b=128]", result.toString());
		assertEquals(255, result.getAlpha());
		assertEquals(255, result.getGreen());
		assertEquals(128, result.getRed());
		assertEquals(128, result.getBlue());
		assertEquals(-8323200, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the Color getCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetCouleur_4()
		throws Exception {
		int couleur = 2;

		Color result = Couleur.getCouleur(couleur);

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=128,g=128,b=255]", result.toString());
		assertEquals(255, result.getAlpha());
		assertEquals(128, result.getGreen());
		assertEquals(128, result.getRed());
		assertEquals(255, result.getBlue());
		assertEquals(-8355585, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the String getNomCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetNomCouleur_1()
		throws Exception {
		int couleur = 3;

		String result = Couleur.getNomCouleur(couleur);

		// add additional test code here
		assertEquals("Gris clair", result);
	}

	/**
	 * Run the String getNomCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetNomCouleur_2()
		throws Exception {
		int couleur = 0;

		String result = Couleur.getNomCouleur(couleur);

		// add additional test code here
		assertEquals("Rouge clair", result);
	}

	/**
	 * Run the String getNomCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetNomCouleur_3()
		throws Exception {
		int couleur = 1;

		String result = Couleur.getNomCouleur(couleur);

		// add additional test code here
		assertEquals("Vert clair", result);
	}

	/**
	 * Run the String getNomCouleur(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetNomCouleur_4()
		throws Exception {
		int couleur = 2;

		String result = Couleur.getNomCouleur(couleur);

		// add additional test code here
		assertEquals("Bleu clair", result);
	}

	/**
	 * Run the int getSize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:26
	 */
	@Test
	public void testGetSize_1()
		throws Exception {

		int result = Couleur.getSize();

		// add additional test code here
		assertEquals(4, result);
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
		new org.junit.runner.JUnitCore().run(CouleurTest.class);
	}
}