package network;

import java.net.Socket;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>ClientTest</code> contains tests for the class <code>{@link Client}</code>.
 *
 * @generatedBy CodePro at 14/04/16 15:28
 * @author sony
 * @version $Revision: 1.0 $
 */
public class ClientTest {
	/**
	 * Run the Client() constructor test.
	 *
	 * @generatedBy CodePro at 14/04/16 15:28
	 */
	@Test
	public void testClient_1()
		throws Exception {
		Client result = new Client();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Socket getSocket(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:28
	 */
	@Test
	public void testGetSocket_1()
		throws Exception {
		String hostname = "";

		Socket result = Client.getSocket(hostname);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Socket[addr=localhost/127.0.0.1,port=10004,localport=53763]", result.toString());
		assertEquals(10004, result.getPort());
		assertEquals(null, result.getChannel());
		assertEquals(false, result.getKeepAlive());
		assertEquals(53763, result.getLocalPort());
		assertEquals(false, result.getOOBInline());
		assertEquals(65536, result.getReceiveBufferSize());
		assertEquals(false, result.getReuseAddress());
		assertEquals(65536, result.getSendBufferSize());
		assertEquals(-1, result.getSoLinger());
		assertEquals(false, result.getTcpNoDelay());
		assertEquals(0, result.getTrafficClass());
		assertEquals(false, result.isInputShutdown());
		assertEquals(false, result.isOutputShutdown());
		assertEquals(false, result.isClosed());
		assertEquals(true, result.isBound());
		assertEquals(true, result.isConnected());
		assertEquals(0, result.getSoTimeout());
	}

	/**
	 * Run the Socket getSocket(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 14/04/16 15:28
	 */
	@Test
	public void testGetSocket_2()
		throws Exception {
		String hostname = "";

		Socket result = Client.getSocket(hostname);

		// add additional test code here
		assertNotNull(result);
		assertEquals("Socket[addr=localhost/127.0.0.1,port=10004,localport=53764]", result.toString());
		assertEquals(10004, result.getPort());
		assertEquals(null, result.getChannel());
		assertEquals(false, result.getKeepAlive());
		assertEquals(53764, result.getLocalPort());
		assertEquals(false, result.getOOBInline());
		assertEquals(65536, result.getReceiveBufferSize());
		assertEquals(false, result.getReuseAddress());
		assertEquals(65536, result.getSendBufferSize());
		assertEquals(-1, result.getSoLinger());
		assertEquals(false, result.getTcpNoDelay());
		assertEquals(0, result.getTrafficClass());
		assertEquals(false, result.isInputShutdown());
		assertEquals(false, result.isOutputShutdown());
		assertEquals(false, result.isClosed());
		assertEquals(true, result.isBound());
		assertEquals(true, result.isConnected());
		assertEquals(0, result.getSoTimeout());
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 14/04/16 15:28
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
	 * @generatedBy CodePro at 14/04/16 15:28
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
	 * @generatedBy CodePro at 14/04/16 15:28
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ClientTest.class);
	}
}