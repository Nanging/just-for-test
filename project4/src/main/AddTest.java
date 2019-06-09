package main;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddTest {

//	@Test
//	public void testAdd() {
//		assertEquals(9, new Main().add(5, 4));
//	}
	int except;  
    int input1;  
    int input2;  
    
    @Parameters
    public static Collection<Object[]> initTestData(){
    	return Arrays.asList(
	        new Object[][]{
	        {3,1,2},
	        {10,5,5},
	        {6,4,2},
	        {7,3,4}}
        );
    }
    
    public AddTest(int except,int input1,int input2){
	    this.except = except;
	    this.input1 = input1;
	    this.input2 = input2;
    }

    @Test
    public void testAdd2() {
    	assertEquals(except, new Main().add(input1, input2));
    }

}
