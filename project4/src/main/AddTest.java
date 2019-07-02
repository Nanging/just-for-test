package main;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;

//@RunWith(Parameterized.class)
public class AddTest extends TestCase{

	@Test
	public void testAdd() {
		assertEquals(9, new Main().add(5, 4));
	}
    public AddTest(String args) {
    	super(args);
    }
    @Test
    public void testAdd2() {
    	assertEquals(3, new Main().add(2, 2));

    }

}
