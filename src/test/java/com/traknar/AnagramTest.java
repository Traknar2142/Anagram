package com.traknar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testSingleWord() {
		String actual = Anagram.createAnagram("inpitString");
		assertEquals("gnirtStipni", actual);
	}
	@Test
	void testSingleLetter() {
		String actual = Anagram.createAnagram("A");
		assertEquals("A", actual);
	}	
	@Test
	void testNum() {
		String actual = Anagram.createAnagram("111");
		assertEquals("111", actual);
	}
	@Test
	void testNothing() {
		String actual = Anagram.createAnagram("");
		assertEquals("", actual);
	}
	@Test
	void testSeveralWords() {
		String actual = Anagram.createAnagram("abc a1bc a1b2c3 abc123");
		assertEquals("cba c1ba c1b2a3 cba123", actual);
	}


}
