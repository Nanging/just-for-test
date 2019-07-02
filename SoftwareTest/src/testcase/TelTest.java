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
public class TelTest {
	 @Parameters
	    public static Collection<Object[]> initTestData(){
			return Arrays.asList(
		    		new Object[][]{
				        {"30.00",0,6,100.0},{"30.15",1,6,100.0},{"34.50",30,6,100.0},{"38.85",59,6,100.0},{"39.00",60,6,100.0},
				        {"39.15",61,6,100.0},{"43.50",90,6,100.0},{"47.85",119,6,100.0},{"48.00",120,6,100.0},{"48.15",121,6,100.0},
				        {"52.50",150,6,100.0},{"56.85",179,6,100.0},{"57.00",180,6,100.0},{"57.15",181,6,100.0},{"66.00",240,6,100.0},
				        {"74.85",299,6,100.0},{"75.00",300,6,100.0},{"31.35",301,6,100.0},{"30.45",150,0,100.0},{"30.45",150,1,100.0},
				        {"52.50",150,6,100.0},{"52.50",150,11,100.0},{"52.50",150,12,100.0},{"47.50",150,6,0.0},{"47.55",150,6,1.0},
				        {"52.50",150,6,100.0},{"输入错误",-1,6,100.0},{"输入错误",150,-1,100.0},{"输入错误",150,13,100.0},{"输入错误",150,6,-1.0}}
			        );
	    }
		private String result;
	    private int min;
	    private int time;
	    private double delay;
	    
		public TelTest(String result,int min,int time,double delay) {
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
