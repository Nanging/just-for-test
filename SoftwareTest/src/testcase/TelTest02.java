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
public class TelTest02 {
	 @Parameters
	    public static Collection<Object[]> initTestData(){
			return Arrays.asList(
					new Object[][]{
				        {"30.05",30,1,100.0},{"34.50",30,2,100.0},{"34.50",30,3,100.0},{"34.50",30,5,100.0},{"34.50",30,9,100.0},
				        {"30.20",90,1,100.0},{"30.20",90,2,100.0},{"43.50",90,3,100.0},{"43.50",90,5,100.0},{"43.50",90,9,100.0},
				        {"30.45",150,1,100.0},{"30.45",150,2,100.0},{"30.45",150,3,100.0},{"52.50",150,5,100.0},{"52.50",150,9,100.0},
				        {"30.90",240,1,100.0},{"30.90",240,2,100.0},{"30.90",240,3,100.0},{"66.00",240,5,100.0},{"66.00",240,9,100.0},
				        {"31.62",360,1,100.0},{"31.62",360,2,100.0},{"31.62",360,3,100.0},{"31.62",360,5,100.0},{"84.00",360,9,100.0},
				        {"输入错误",-1,6,100.0},{"输入错误",150,-1,100.0},{"输入错误",150,13,100.0},{"输入错误",150,6,-1.0}}
			        );
	    }
		private String result;
	    private int min;
	    private int time;
	    private double delay;
	    
		public TelTest02(String result,int min,int time,double delay) {
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
