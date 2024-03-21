package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	void test() {  //provided by Test file and it is used to test the expected po and actual result.
		int a[]= {2,3,1};
		MyMath math= new MyMath();
		int result=math.CalculateSum(a);
		int expectedresult=6;
		assertEquals(expectedresult,result);
		
		fail("Sum is not Matched");
	}
	@Test
	void test() {  //provided by Test file and it is used to test the expected po and actual result.
		int a[]= {};
		MyMath math= new MyMath();
		int result=math.CalculateSum(a);
		int expectedresult=0;
		assertEquals(expectedresult,result);
		
		fail("not zero");
	}

}
