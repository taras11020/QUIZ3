package pkgMain;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Triangle.triangle.triangle;

import java.math.*;

public class triangleTest {
	//Here I am going to test for imaginary triangle
	@Test(expected=InvalTrigException.class)
	public final void testInvalTrianglefirst() throws InvalTrigException{
		triangle t1 = new triangle(2,2,5);
		fail("Sides can not form a triangle, InvalTrigException is required ");
	}
	//Here I will check the case scenario when someone puts 0,0,0 for all sides
	@Test(expected=InvalTrigException.class)
	public final void testInvalTrianglesecond() throws InvalTrigException{
		triangle t1 = new triangle(0,0,0);
		fail("All sides are 0, they can't form a triangle, InvalTrigException is required ");
	}
	
	@Test
	public final void testPerimeterTriangle() {
		triangle t1 = new triangle(4.0, 4.0, 4.0);
		assertTrue(t1.getPerimeter() == 12.0);
		triangle t2 = new triangle(5.0, 5.0, 5.0);
		assertTrue(t2.getPerimeter() == 15.0);
	}
	
	@Test
	public final void testAreaTriangle() {
		triangle t3 = new triangle(4.0, 4.0, 4.0);
		assertTrue(Math.floor(t3.getArea()) == 6.0);
		triangle t4 = new triangle(5.0, 5.0, 5.0);
		assertTrue(Math.floor(t4.getArea()) == 10.0);
	}
}

