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
	public static void BeforeClass() throws Exception {
	// System.out.println("BeforeClass method will be executed before first test method starts"); 
	

	}

	@AfterClass
	public static void AfterClass() throws Exception {
	// System.out.println("AfterClass method will be executed after last test method complited");	
	}
	

	@Before
	public void Before() throws Exception {
	// System.out.println("Before method will execute before every test method");
	}
	

	@After
	public void After() throws Exception {
	// System.out.println("After method will execute after every test method");
	}
	

	@Test
	public void test_01_assertEquals_Positive() {
		// System.out.println("Test _01_assertEquals_Positive");
		assertEquals("String not the same","Testing JUnit 4", App.s);
		
		
	}
	
	@Test
	public void test_02_assertEquals_Negative() {
		// System.out.println("Test _02_assertEquals_Negative");
		assertEquals("String not the same","Testing TestNG 6", App.s);
		
	}
	
	
	@Ignore
	@Test
	public void test_03_assertEquals_Ignored() {
		// System.out.println("Test _03_assertEquals_Ignored");
		assertEquals("String not the same","Testing JUnit 3", App.s);
		
		
		
	}
	@Test
	public void test_04_assertSame_Positive() {
		// System.out.println("Test _04_assertSame_Positive");
		assertSame("Integer not the same", 55, App.i);
		
		
	}
	
	@Test
	public void test_05_assertSame_Negative() {
		// System.out.println("Test _05_assertSame_Negative");
		assertSame("Integer not the same", 25, App.i);
		
		
		
	}
	@Ignore
	@Test
	public void test_06_assertSame_Ignored() {
		// System.out.println("Test _06_assertSame_Ignored");
		assertSame("Integer not the same", 100, App.i);
		
		
	}
	@Test
	public void test_07_assertFalse_Positive() {
		// System.out.println("Test _07_assertFalse_Positive");
		assertFalse("Boolean should be faulse", App.f);
		
		
	}
	
	@Test
	public void test_08_assertFalse_Negative(){
		// System.out.println("Test _08_assertFalse_Negative");
		assertFalse("Boolean should be faulse", App.t);
		
		
	}
	@Test
	public void test_09_assertTrue_Positive() {
		// System.out.println("Test _09_assertTrue_Positive");
		assertTrue("Boolean should be true", App.t);
		
		
	}
	
	@Test
	public void test_10_assertTrue_Negative() {
		//System.out.println("Test _10_assertTrue_Negative");
		assertTrue("Boolean should be true", App.f);
		
		
	}
}
