package org.howard.edu.lsp.midterm.problem51;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerRangeTest {
	
	@Test
	public void testContains()
	{
		Range r = new IntegerRange(1, 5);
		assertTrue(r.contains(1));
		assertTrue(r.contains(5));
		assertTrue(r.contains(3));
		assertFalse(r.contains(0));
		assertFalse(r.contains(6));
	}
	
	@Test
	public void testOverlaps() throws EmptyRangeException
	{
		Range r1 = new IntegerRange(1, 5);
		Range r2 = new IntegerRange(3, 7);
		Range r3 = new IntegerRange(6, 10);
		assertTrue(r1.overlaps(r2));
		assertTrue(r2.overlaps(r3));
		assertFalse(r3.overlaps(r1));
		assertFalse(r1.overlaps(r3));
		
	}
	
	@Test
	public void testSize()
	{
		Range r = new IntegerRange(1, 5);
		assertEquals(5, r.size());
		r = new IntegerRange(5, 1);
		assertEquals(0, r.size());
	}

}
