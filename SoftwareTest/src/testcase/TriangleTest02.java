package testcase;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sTest.Triangle;


@RunWith(Parameterized.class)
public class TriangleTest02{
	@Parameters
    public static Collection<Object[]> initTestData(){
		return Arrays.asList(
		        new Object[][]{
			        {"非三角形",1, 2, 3},{"一般三角形",2, 3, 4},{"等腰三角形",3, 3, 4},
			        {"等边三角形",4, 4, 4},{"a、b、c必须大于0",-1, 2, 3},{"a、b、c必须大于0",-2, -3, -4},
			        {"a、b、c必须大于0",-4, -4, -3},{"a、b、c必须大于0",-4, -4, -4},{"a、b、c应该小于等于1000",999, 1000, 2001},
			        {"a、b、c应该小于等于1000",999, 1000, 1001},{"a、b、c应该小于等于1000",1001, 1001, 1002},
			        {"a、b、c应该小于等于1000",1002, 1002, 1002}
			        }
		        );
    }
	private String result;
    private float a;
    private float b;
    private float c;
    
	public TriangleTest02(String result, float a, float b, float c) {
		this.result = result;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public final void testTriangle() {
		assertEquals(result, Triangle.triangle(a, b, c));
		
	}
}
