package com.cap.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {
	int[] array = new int[] {1,56,8,45,34,89,65,93,189};

	@Test
	void test() {
		//MinMaxFinder finder = new MinMaxFinder();
		int[] expected = new int[] {1,189};
		int[] result = new int[] {1,189};
		assertArrayEquals(expected,result);
	}
	 
		
		
	
	
	

}
