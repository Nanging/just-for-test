package testcase;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import sTest.Tel;


@RunWith(Parameterized.class)
public class TelTest03 {
	 @Parameters
	    public static Collection<Object[]> initTestData(){
			return Arrays.asList(
			        new Object[][]{
				        {"30.05",30,1,100.0},{"34.50",30,7,100.0},{"30.20",90,2,100.0},{"43.50",90,7,100.0},{"30.45",150,3,100.0},
				        {"52.50",150,7,100.0},{"30.90",240,3,100.0},{"66.00",240,7,100.0},{"31.62",360,6,100.0},{"84.00",360,9,100.0}}
			        );	
	    }
		private String result;
	    private int min;
	    private int time;
	    private double delay;
	    
		public TelTest03(String result,int min,int time,double delay) {
			this.result = result;
			this.min = min;
			this.time = time;
			this.delay = delay;
		}

		@Before
		public void setUp() throws Exception {
			
		}

		@Test
		public final void testTel() {
			assertEquals(result, Tel.calculate(min, time, delay));
			
		}
}
