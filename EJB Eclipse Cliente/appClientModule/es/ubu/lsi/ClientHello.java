package es.ubu.lsi;

import java.io.FileInputStream;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Example of EJB Client with Eclipse / GlassFish.
 * 
 * @author Raúl Marticorena
 *
 */
public class ClientHello {

	/**
	 * Run.
	 * 
	 * @throws Exception if there is any problem with the server
	 */
	public void runTest() throws Exception {

		Properties props = new Properties();
		props.load(new FileInputStream("jndi.properties"));

		// Other solution using properties embedded in code...
		//
//		props.put(Context.INITIAL_CONTEXT_FACTORY,
//				"com.sun.enterprise.naming.SerialInitContextFactory");
//
//		props.setProperty("java.naming.factory.url.pkgs",
//				"com.sun.enterprise.naming");
//		props.setProperty("java.naming.factory.state",
//				"com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
//		props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
//		// glassfish default port value will be 3700,
//		props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

		InitialContext ctx = new InitialContext(props);
		HelloBeanRemote bean = (HelloBeanRemote) ctx
				.lookup("java:global/EJB_Eclipse_Servidor/HelloBean!es.ubu.lsi.HelloBeanRemote");

		String result = bean.hello();
		System.out.println(result);
	}

	/**
	 * Main.
	 * 
	 * @param args arguments
	 */
	public static void main(String[] args) {
		try {
			ClientHello cli = new ClientHello();
			cli.runTest();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}