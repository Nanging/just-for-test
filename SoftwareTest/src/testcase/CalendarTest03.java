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

import sTest.Calendar;

@RunWith(Parameterized.class)
public class CalendarTest03{
	
    @Parameters
    public static Collection<Object[]> initTestData(){
		return Arrays.asList(
		        new Object[][]{
		        	{"2019-6-16",2019, 6, 15},
		        	{"2020-2-29",2020, 2, 28},
		        	{"2019-3-1",2019, 2, 28},
		        	{"2019-4-29",2019, 4, 28},
		        	{"2020-3-1",2020, 2, 29},
		        	{"2020-7-30",2020, 7, 29},
		        	{"2019年2月没有29日",2019, 2, 29},
		        	{"2019-5-30",2019, 5, 29},
		        	{"2019年2月没有30日",2019, 2, 30},
		        	{"2019-5-1",2019, 4, 30},
		        	{"2019-5-31",2019, 5, 30},
		        	{"2019年2月没有31日",2019, 2, 31},
		        	{"2019-2-1",2019, 1, 31},
		        	{"2020-1-1",2019, 12, 31}
		        	}
		        );	
    }
	private String result;
    private int year;
    private int month;
    private int day;
    
	public CalendarTest03(String result,int year,int month,int day) {
		this.result = result;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public final void testCalendar() {
		assertEquals(result, Calendar.calendar(year, month, day));
	}
}
