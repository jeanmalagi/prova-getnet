package br.com.getnet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest  extends TestCase {

	public AppTest( String testName ) {
		super( testName );
	}

	public static Test suite() {
		return new TestSuite( TesteApi.class );
	}

	public void testApp() {
		assertTrue( true );
	}
}
