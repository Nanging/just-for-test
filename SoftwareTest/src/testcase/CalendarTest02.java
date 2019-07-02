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
public class CalendarTest02{
	
    @Parameters
    public static Collection<Object[]> initTestData(){
    	return Arrays.asList(
		        new Object[][]{
		        	{"2019-1-16",2019, 1, 15},{"2019-3-29",2019, 3, 28},{"2019-5-30",2019, 5, 29},
		        	{"2019-7-31",2019, 7, 30},{"2019-9-1",2019, 8, 31},{"2019-4-17",2019, 4, 16},
		        	{"2019-6-29",2019, 6, 28},{"2019-9-30",2019, 9, 29},{"2019-12-1",2019, 11, 30},
		        	{"2019年6月没有31日",2019, 6, 31},{"2019-2-16",2019, 2, 15},{"2019-3-1",2019, 2, 28},
		        	{"2019年2月没有29日",2019, 2, 29},{"2019年2月没有30日",2019, 2, 30},{"2019年2月没有31日",2019, 2, 31},
		        	{"2019-12-15",2019, 12, 14},{"2019-12-29",2019, 12, 28},{"2019-12-30",2019, 12, 29},
		        	{"2019-12-31",2019, 12, 30},{"2020-1-1",2019, 12, 31},{"2020-1-16",2020, 1, 15},
		        	{"2020-3-29",2020, 3, 28},{"2020-5-30",2020, 5, 29},{"2020-7-31",2020, 7, 30},
		        	{"2020-9-1",2020, 8, 31},{"2020-4-14",2020, 4, 13},{"2020-6-29",2020, 6,28},
		        	{"2020-9-30",2020, 9, 29},{"2020-12-1",2020, 11, 30},{"2020年9月没有31日",2020, 9, 31},
		        	{"2020-2-12",2020, 2, 11},{"2020-2-29",2020, 2, 28},{"2020-3-1",2020, 2, 29},
		        	{"2020年2月没有30日",2020, 2, 30},{"2020年2月没有31日",2020, 2, 31},{"2020-12-20",2020, 12, 19},
		        	{"2020-12-29",2020, 12, 28},{"2020-12-30",2020, 12, 29},{"2020-12-31",2020, 12, 30},
		        	{"2021-1-1",2020, 12, 31}    
		        	}
		        );		
    }
	private String result;
    private int year;
    private int month;
    private int day;
    
	public CalendarTest02(String result,int year,int month,int day) {
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
