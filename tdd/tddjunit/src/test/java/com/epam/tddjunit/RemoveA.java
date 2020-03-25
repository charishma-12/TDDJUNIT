
package com.epam.tddjunit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import static org.junit.jupitr.api.Assertions.assertEquals;
//import org.junit.jupiter.api.Test;
public class RemoveA {
	@Test
	public void testString1() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","B",r.update("B"));
	}
	@Test
	public void testString2() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","CD",r.update("AACD")); 
	}
	@Test
	public void testString3() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","BCD",r.update("BACD"));
	}
	@Test
	public void testString4() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","",r.update("AA"));
	}
	@Test
	public void testString5() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","",r.update(""));
	}
	@Test
	public void testString6() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","BCDAC",r.update("BCDAC"));
	}
	@Test
	public void testString7() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","",r.update("A"));
	}
	@Test
	public void testString8() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","BB",r.update("BB"));
	}
	@Test
	public void testString9() {
		RemoveMain r=new RemoveMain();
		assertEquals("Output String is : ","B",r.update("AB"));
	}
	
}
