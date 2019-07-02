package main;
/**
 * @author user
 *
 */

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class Main {

	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public int add(int a, int b) {
		return a + b;
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite("test");
		suite.addTestSuite(AddTest.class);
		suite.addTest(new AddTest("testAdd"));
		suite.addTest(new AddTest("testAdd2"));
		return suite;
	}
}
