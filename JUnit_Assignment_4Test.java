package com.cap.io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnit_Assignment_4Test {

	@BeforeEach
	void runBeforeEveryTest() {
	  System.out.println("@BeforeEach executed");
	}
	@BeforeAll
	  static void runOnceBeforeAllTests() {
	    System.out.println("@BeforeAll executed \n");
	}
	@Test
	void test() {
		System.out.println("Test cases ");
	}
	
	
	@AfterEach
	void runAfterEveryTest() {
	  System.out.println("@AfterEach executed \n");
	}
	@AfterAll
	  static void runOnceAfterAllTests() {
	    System.out.println("@AfterAll executed");
	  }

}
