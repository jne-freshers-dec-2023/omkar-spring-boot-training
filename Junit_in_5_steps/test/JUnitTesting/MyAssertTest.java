package JUnitTesting;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String> todo =Arrays.asList("AWS","JAva");

	@Test
	void test() {
		boolean b=todo.contains("AWS");
		int l= todo.size();		
		
		asertEquals=(true,b); // works on Boolean value
		asertEquals=(1,l,"size not matched");
	}
	
	@beforeAll
	void beforeal() {
        System.out.println("it will execute before all test");
	}
	
	@afterAll
	void aftereall() {
        System.out.println("it will execute after all test");
	}
	
	@beforeEach
	void beforeEach() {
        System.out.println("it will execute before each test");
	}

	@afterEach
	void afterEach() {
        System.out.println("it will execute after each test");
	}
}
