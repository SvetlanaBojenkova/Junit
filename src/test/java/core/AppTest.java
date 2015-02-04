package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("Beforeclass method will be executed before first test method starts");
	

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("AfterClass method will be executed after last test method complited");	
	}
	

	@Before
	public void setUp() throws Exception {
	System.out.println("Before method will execute before every test method");
	}
	

	@After
	public void tearDown() throws Exception {
	System.out.println("After method will execute after every test method");
	}
	

	@Test
	public void test_01_assertEquals_Positive() {
		System.out.println("Test _01_assertEquals_Positive");
		assertEquals("Test case fail","hi","hi");
		
		
	}
	@Test
	public void test_02_assertEquals_Negative() {
		System.out.println("Test _02_assertEquals_Negative");
		assertEquals("Test case fail","hi","bye");
		
		
	}
	
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		System.out.println("Test _03_assertEquals_Ignored");
		assertEquals("Test case fail","la","la");
		
		
	}
	@Test
	public void test_04_assertSame_Positive() {
		System.out.println("Test _04_assertSame_Positive");
		assertSame("Test case fail",12,12);
		
		
	}
	@Test
	public void test_05_assertSame_Negative() {
		System.out.println("Test _05_assertSame_Negative");
		assertSame("Test case fail",12,13);
		
		
	}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored() {
		System.out.println("Test _06_assertSame_Ignored");
		assertSame("Test case fail",150,300);
		
		
	}
	@Test
	public void test_07_assertFalse_Positive() {
		System.out.println("Test _07_assertFalse_Positive");
		assertFalse("Test case fail",false);
		
		
	}
	@Test
	public void test_08_assertFalse_Negative(){
		System.out.println("Test _08_assertFalse_Negative");
		assertFalse("Test case fail",true);
		
		
	}
	@Test
	public void test_09_assertTrue_Positive() {
		System.out.println("Test _09_assertTrue_Positive");
		assertTrue("Test case fail",true);
		
		
	}
	@Test
	public void test_10_assertTrue_Negative() {
		System.out.println("Test _10_assertTrue_Negative");
		assertTrue("Test case fail",false);
		
		
	}
}
